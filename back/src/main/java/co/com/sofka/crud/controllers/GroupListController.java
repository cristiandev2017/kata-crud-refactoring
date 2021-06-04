package co.com.sofka.crud.controllers;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entity.GroupList;
import co.com.sofka.crud.services.GroupListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins="http://localhost:3000")
public class GroupListController {

    @Autowired
    private GroupListService service;

    @GetMapping(value = "api/grouptodos")
    public Iterable<GroupList> list(){
        return service.list();
    }

    @PostMapping(value = "api/grouptodo/save")
    public GroupList save(@RequestBody GroupList groupList){
        return service.save(groupList);
    }

    @PutMapping(value = "api/grouptodo/update")
    public GroupList update(@RequestBody GroupList groupList){
        if(groupList.getIdgroup() != null){
            return service.save(groupList);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "api/{id}/grouptodo")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/grouptodo")
    public void get(@PathVariable("id") Long id){
        service.get(id);
    }
}
