package co.com.sofka.crud;

import co.com.sofka.crud.entity.Todo;

public interface DAO {
    //Esto me dara una capa adicional de seguridad lo que hace es llamar al DAO antes del servicio
    public Iterable <Todo> list();

    public Todo save(Todo todo);

    public void delete(Long id);

    public Todo get(Long id);
}
