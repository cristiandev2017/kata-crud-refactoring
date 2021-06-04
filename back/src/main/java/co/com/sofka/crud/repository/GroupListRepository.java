package co.com.sofka.crud.repository;

import co.com.sofka.crud.entity.GroupList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupListRepository extends CrudRepository<GroupList, Long>{
}
