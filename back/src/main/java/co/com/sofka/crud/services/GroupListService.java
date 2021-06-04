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
        return grouprepository.findAll();
    }

    @Override
    public GroupList save(GroupList groupList) {
        return grouprepository.save(groupList);
    }

    @Override
    public void delete(Long id) {
        grouprepository.delete(get(id));
    }

    @Override
    public GroupList get(Long id) {
        return grouprepository.findById(id).orElseThrow();
    }
}
