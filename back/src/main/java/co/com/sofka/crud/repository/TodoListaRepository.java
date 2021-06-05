package co.com.sofka.crud.repository;

import co.com.sofka.crud.entity.TodoListageneral;
import org.springframework.data.repository.CrudRepository;

public interface TodoListaRepository extends CrudRepository<TodoListageneral, Long> {
}
