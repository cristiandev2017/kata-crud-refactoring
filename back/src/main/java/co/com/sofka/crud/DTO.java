package co.com.sofka.crud;

public interface DTO {
    //Esto me dara una capa adicional de seguridad lo que hace es llamar al DTO antes del servicio
    public Iterable <Todo> list();

    public Todo save(Todo todo);

    public void delete(Long id);

    public Todo get(Long id);
}
