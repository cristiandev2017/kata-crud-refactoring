package co.com.sofka.crud.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="grouplist")
public class GroupList {
    @Id
    @GeneratedValue
    private Long idgroup;
    private String namegroup;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "groupid")
    //Se instancia la entidad
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
