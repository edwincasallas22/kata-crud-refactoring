package co.com.sofka.crud.dto;

import java.util.List;

public class SuperListDTO {
    private Long idlista;
    private String name;
    private List<TodoDTO> todos;

    public List<TodoDTO> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoDTO> todos) {
        this.todos = todos;
    }

    public Long getIdlista() {
        return idlista;
    }

    public void setIdlista(Long idlista) {
        this.idlista = idlista;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}