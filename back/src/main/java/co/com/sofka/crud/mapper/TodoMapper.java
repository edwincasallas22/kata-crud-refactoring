package co.com.sofka.crud.mapper;


import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entity.Todo;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TodoMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "completed", target = "completed"),
            @Mapping(source = "groupListId", target = "groupListId")
    })
    TodoDTO convertiraDTO(Todo todo);
    Iterable<TodoDTO> toTodoDTOs (Iterable<Todo> todos);
    @InheritConfiguration
    Todo aTodo(TodoDTO todoDTO);


}
