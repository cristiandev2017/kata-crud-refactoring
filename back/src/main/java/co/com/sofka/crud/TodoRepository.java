package co.com.sofka.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Se agrega para decirle a spring que es un repository
@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
