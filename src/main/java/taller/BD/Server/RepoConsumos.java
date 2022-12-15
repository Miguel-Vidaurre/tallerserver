package taller.BD.Server;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestResource(path="consumos")
public interface RepoConsumos extends CrudRepository<Consumos,Integer> {
    public List<Consumos> findByMed(Medidor id);
}
