package taller.BD.Server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestResource(path = "usuarios")
@CrossOrigin("*")
public interface RepoUsuarios extends CrudRepository<Usuario,String> {

}