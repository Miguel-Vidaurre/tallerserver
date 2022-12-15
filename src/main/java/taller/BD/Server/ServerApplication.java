package taller.BD.Server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(RepoUsuarios repositoryy, 
	RepoSolicitudes X, RepoReclamos Y,RepoRoles repository)
	 {
  	  return (args) -> {
		System.out.println("Estoy añadiendo un usuario");
		Usuario t = new Usuario();
		t.setLogin("Miguel");t.setClave("123456");
		repositoryy.save(t);
		/*Solicitudes tmp = new Solicitudes();
		tmp.setDetalle("Prueba2");
		tmp.setAtendido(true);
		X.save(tmp);
		Reclamos tmp2 = new Reclamos();
		tmp2.setResultado("Pendiente");
		Y.save(tmp2);*/
		Roles r=new Roles();
		r.setId(1);
		r.setAutoridad("Administrador");
		r.setDescripcion("Administra Página");
		repository.save(r);

		r.setId(2);
		r.setAutoridad("Asociado");
		r.setDescripcion("Socios en general");
		repository.save(r);
		
		r.setId(3);
		r.setAutoridad("Cajero");
		r.setDescripcion("Controla las cuentas y Cobros");
		repository.save(r);
		
		r.setId(4);
		r.setAutoridad("Plomero");
		r.setDescripcion("Recibe las Solicitudes");
		repository.save(r);
	  };
	}	
}
