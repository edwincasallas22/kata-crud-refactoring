package co.com.sofka.crud.entity;


import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "superList")
public class SuperList {

    @Id
    @GeneratedValue
    private Long groupId;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "groupId")
    private List<Todo> todos;

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}