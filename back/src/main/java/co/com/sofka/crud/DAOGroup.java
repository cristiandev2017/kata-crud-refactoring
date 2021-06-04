package co.com.sofka.crud;

import co.com.sofka.crud.entity.GroupList;

public interface DAOGroup {

    public Iterable<GroupList> list();

    public GroupList save(GroupList groupList);

    public void delete(Long id);

    public GroupList get(Long id);
}
