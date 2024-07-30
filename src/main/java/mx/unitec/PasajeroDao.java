package mx.unitec;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Data Access Object
@Repository
public interface PasajeroDao extends CrudRepository<Pasajero, Integer> {

}
