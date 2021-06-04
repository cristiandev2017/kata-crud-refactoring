package co.com.sofka.crud.services;


import co.com.sofka.crud.DAOGroup;
import co.com.sofka.crud.entity.GroupList;
import co.com.sofka.crud.repository.GroupListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupListService implements DAOGroup {

    @Autowired
    private GroupListRepository grouprepository;


    @Override
    public Iterable<GroupList> list() {
        return null;
    }

    @Override
    public GroupList save(GroupList todo) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public GroupList get(Long id) {
        return null;
    }
}
