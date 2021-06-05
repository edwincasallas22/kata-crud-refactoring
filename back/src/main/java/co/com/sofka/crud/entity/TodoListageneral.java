package co.com.sofka.crud.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "todoListageneral")
public class TodoListageneral {

    @Id
    @GeneratedValue
    private Long groupListId;
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "groupListId")
    private List<Todo> todos;

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }

    public Long getGroupListId() {
        return groupListId;
    }

    public void setGroupListId(Long groupListId) {
        this.groupListId = groupListId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

