package co.com.sofka.crud.service;

import co.com.sofka.crud.dto.TodoListaDTO;
import co.com.sofka.crud.entity.TodoListageneral;
import co.com.sofka.crud.mapper.TodoListaMapper;
import co.com.sofka.crud.repository.TodoListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoListaservice {

    @Autowired
    private TodoListaRepository listaRepository;

    @Autowired
    private TodoListaMapper mapperLista;
    public  Iterable<TodoListaDTO> list(){
        Iterable<TodoListageneral> todoListagenerals = listaRepository.findAll();
        return mapperLista.toTodoListaDTOs(todoListagenerals);
    }
    public TodoListaDTO save(TodoListaDTO todoListaDTO){
        TodoListageneral todoListageneral = mapperLista.aTodoListageneral(todoListaDTO);
        return mapperLista.convertiraDTO(listaRepository.save(todoListageneral));
    }

    public void delete(Long idlist){
        listaRepository.delete(mapperLista.aTodoListageneral(get(idlist)));
    }
    public TodoListaDTO get(Long idlist){
        return mapperLista.convertiraDTO(listaRepository.findById(idlist).orElseThrow());
    }
}