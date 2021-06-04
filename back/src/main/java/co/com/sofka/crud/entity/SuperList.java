
package co.com.sofka.crud.entity;


import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "SuperList")
public class SuperList {
    @Id
    @GeneratedValue
   //@Column(unique = true, nullable = false)
    private Long id;
    private String name;

   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "groupListId_id")
    private Set<Todo> todo;

    public Set<Todo> getTodo() {
        return todo;
    }

    public void setTodo(Set<Todo> todo) {
        this.todo = todo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
