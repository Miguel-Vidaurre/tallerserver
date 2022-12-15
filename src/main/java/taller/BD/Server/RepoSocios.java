package taller.BD.Server;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*")
@RestResource(path="socios")
public interface RepoSocios extends CrudRepository<Socio,Integer> {
    List<Socio> findByApellidos(String param);
    Integer countByApellidos(String param);
    List<Socio> findByApellidosAndNombresAllIgnoreCase(String param1,String param2);
}
