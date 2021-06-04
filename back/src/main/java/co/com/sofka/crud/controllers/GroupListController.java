package co.com.sofka.crud.controllers;

import co.com.sofka.crud.entity.GroupList;
import co.com.sofka.crud.services.GroupListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins="http://localhost:8080")
public class GroupListController {

    @Autowired
    private GroupListService service;

    @GetMapping(value = "api/grouptodos")
    public Iterable<GroupList> list(){
        return service.list();
    }

}
