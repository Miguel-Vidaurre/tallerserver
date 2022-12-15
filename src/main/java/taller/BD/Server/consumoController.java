package taller.BD.Server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class consumoController {
    @Autowired
    private RepoConsumos repoConsumos;

    @Autowired
    private RepoMedidor repoMedidor;
    @GetMapping("/consumos/{id}")
    private @ResponseBody ResponseEntity<Consumos> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(repoConsumos.findById(id).get());
    }
    @GetMapping("/consumos")
    private ResponseEntity<Iterable<Consumos>> getAll() {
        return ResponseEntity.ok(repoConsumos.findAll());
    }
    @GetMapping("/medidors/{id}/lecturas")
    private  ResponseEntity<Iterable<Consumos>> getConsumosMedidor(@PathVariable Integer id) {
        return ResponseEntity.ok(repoMedidor.findById(id).get().getLecturas());
    }
    @PostMapping("/consumos/medidor/{id}")
    private ResponseEntity<Consumos> addConsumosMedidor(@PathVariable Integer id,@RequestBody  Consumos consumo){
        Medidor medidor = repoMedidor.findById(id).get();
        Consumos consumoRepo = new Consumos();
        consumoRepo.setLectura(consumo.getLectura());
        consumoRepo.setFecha(consumo.getFecha());
        consumoRepo.setMed(medidor);
        return ResponseEntity.ok(repoConsumos.save(consumoRepo));
    }
}
