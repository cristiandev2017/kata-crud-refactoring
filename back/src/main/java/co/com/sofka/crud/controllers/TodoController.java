package co.com.sofka.crud.controllers;

import co.com.sofka.crud.DAO;
import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    private DAO service;


    /*public Iterable<Todo> list(){
        return service.list();
    }
    */
    @GetMapping(value = "api/todos")
    public Iterable<TodoDTO> list(){
        return service.list();
    }
    
    @PostMapping(value = "api/save")
    public TodoDTO save(@RequestBody TodoDTO todoDTO){
        return service.save(todoDTO);
    }


    @PutMapping(value = "api/update")
    public TodoDTO update(@RequestBody TodoDTO todo){
        if(todo.getId() != null){
            return service.save(todo);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }


    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id")Long id){
        service.delete(id);
    }

    @GetMapping(value = "api/{id}/todo")
    public TodoDTO get(@PathVariable("id") Long id){
        return service.get(id);
    }

}
