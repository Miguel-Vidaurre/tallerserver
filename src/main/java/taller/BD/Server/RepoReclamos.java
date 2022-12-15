package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface RepoReclamos extends CrudRepository<Reclamos,Integer> {
    
}
