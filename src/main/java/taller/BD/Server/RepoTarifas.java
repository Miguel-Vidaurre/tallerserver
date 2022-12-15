package taller.BD.Server;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestResource(path = "tarifas",rel="tarifas")
@CrossOrigin("*")
public interface RepoTarifas extends CrudRepository<Tarifas,Integer>{
    public List<Tarifas> findByFechaInic(Date fech);
    public Optional<Tarifas> findByFechaInicOrderByConsumoMax(Date fech);
    //public Optional<Tarifas> findTop1ByFechaInicOrderBy(Date fech);
    public Optional<Tarifas> findTop1ByFechaInicOrderById(Date fech);
    public List<Tarifas> findGreaterThanByFechaInic(Date fech);
    @Query("select u from Tarifas u where u.fechaInic<=:fech and u.consumoMax>=:consu order by u.fechaInic desc,u.consumoMax")
    public List<Tarifas> aplic_tarif(@Param("fech") Date fech, @Param("consu") Integer consu);

    public List<Tarifas> findLessThanByFechaInicAndConsumoMaxGreaterThan(Date fech, Integer consu);
}
