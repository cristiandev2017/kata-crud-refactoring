package co.com.sofka.crud.repository;

import co.com.sofka.crud.entity.GroupList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Empieza a buscar por el codigo lo que va a implementar en donde el crudrepository tiene toda esta info.
@Repository
public interface GroupListRepository extends CrudRepository<GroupList, Long>{
}

