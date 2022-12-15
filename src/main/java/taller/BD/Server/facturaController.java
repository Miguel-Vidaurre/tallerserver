package taller.BD.Server;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin("*")
public class facturaController {
    @Autowired
    private RepoFacturas repoFacturas;
    @Autowired
    private RepoConsumos repoConsumos;
    @Autowired
    private RepoTarifas repoTarifas;

    @Autowired
    private RepoMedidor repoMedidor;
    @GetMapping("/facturas")
    public ResponseEntity<Iterable<Facturas>> getRepoFacturas() {
        return ResponseEntity.ok(repoFacturas.findAll());
    }

    @PostMapping("/facturas")
    public ResponseEntity<Facturas> addFactura(Facturas factura) {
        return ResponseEntity.ok(repoFacturas.save(factura));
    }

    @PostMapping("/factura/consumo/{id}")
    private @ResponseBody ResponseEntity<Facturas> findById(@PathVariable Integer id, @RequestBody Facturas facturaR) {
        Consumos consumoRepo = repoConsumos.findById(id).get();
        Optional<Medidor> medidor = repoMedidor.findById(consumoRepo.getMed().getId_Medidor());
        List<Tarifas> tarifas = repoTarifas.aplic_tarif(consumoRepo.getFecha(),
                consumoRepo.getLectura().intValue());
        Facturas factura = new Facturas();
        if (consumoRepo.getId_Consumos() != null) {
            factura.setId(consumoRepo.getId_Consumos());
        }
        System.out.println(consumoRepo.getMed().toString());
        factura.setNit(Integer.valueOf(medidor.get().getSoci().getCi()));
        factura.setRazonsocial(medidor.get().getSoci().getApellidos() + " "
                + medidor.get().getSoci().getNombres());
        factura.setCon(consumoRepo);
        factura.setPeriodo(facturaR.getPeriodo());
        factura.setEstado(false);
        if (tarifas.get(0).getCostoUnit() == null) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
        }
        System.out.println(tarifas.get(0).getCostoUnit());
        factura.setMonto(consumoRepo.getLectura() * tarifas.get(0).getCostoUnit());
        return ResponseEntity.ok(repoFacturas.save(factura));
    }

}
