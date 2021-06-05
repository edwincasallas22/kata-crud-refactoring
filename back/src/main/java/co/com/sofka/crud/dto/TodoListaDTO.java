package co.com.sofka.crud.dto;

import co.com.sofka.crud.entity.Todo;

import java.security.PrivateKey;
import java.util.List;

public class TodoListaDTO {
    private Long idlista;
    private String nombre;
    private List<TodoDTO> todos;

    public Long getIdlista() {
        return idlista;
    }

    public void setIdlista(Long idlista) {
        this.idlista = idlista;
    }

    public List<TodoDTO> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoDTO> todos) {
        this.todos = todos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
