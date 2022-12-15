package taller.BD.Server;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
@RequestMapping("/genera")
public class GeneraFact {
    @Autowired
    private RepoTarifas T;
    @Autowired
    private RepoConsumos C;
    @Autowired
    private RepoFacturas F;

    @GetMapping("/consulta")
    public String resp() {
        return T.findTop1ByFechaInicOrderById(Date.valueOf("2022-09-01")).toString();
    }
    @GetMapping("/menosque")
    public List<Tarifas> respuesta() {
        return T.findLessThanByFechaInicAndConsumoMaxGreaterThan
        (Date.valueOf("2022-09-01"),11);
    }
}
