package co.com.sofka.crud.dto;

import co.com.sofka.crud.entity.Todo;

import javax.persistence.*;
import java.util.Set;

public class GroupListDTO {

    private Long idgroup;
    private String namegroup;

    private Set<Todo> todo;

    public Set<Todo> getTodo() {
        return todo;
    }

    public void setTodo(Set<Todo> todo) {
        this.todo = todo;
    }


    public Long getIdgroup() {
        return idgroup;
    }

    public void setIdgroup(Long idgroup) {
        this.idgroup = idgroup;
    }

    public String getNamegroup() {
        return namegroup;
    }

    public void setNamegroup(String namegroup) {
        this.namegroup = namegroup;
    }

}
