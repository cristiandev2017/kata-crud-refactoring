package co.com.sofka.crud;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entity.Todo;

public interface DAO {
    //Esto me dara una capa adicional de seguridad lo que hace es llamar al DAO antes del servicio
    public Iterable <TodoDTO> list();

    public TodoDTO save(TodoDTO todoDTO);

    public void delete(Long id);

    public TodoDTO get(Long id);
}
