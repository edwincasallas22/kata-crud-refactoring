package co.com.sofka.crud.controller;

import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.dto.TodoListaDTO;
import co.com.sofka.crud.service.TodoListaservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoListageneralController {

    @Autowired
    private TodoListaservice listaService;
    @GetMapping(value = "api/todoListagenerals")
    public Iterable<TodoListaDTO> list(){return listaService.list();}

    @PostMapping(value = "api/todoListageneral")
    public  TodoListaDTO save(@RequestBody TodoListaDTO todoListaDTO){return listaService.save(todoListaDTO);}

    @PutMapping(value = "api/todoListageneral")
    public TodoListaDTO update (@RequestBody TodoListaDTO todoListaDTO){
        if(todoListaDTO.getIdlista() != null){
            return listaService.save(todoListaDTO);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "api/todoListageneral")
    public void delete(@PathVariable("idlista") Long idlist){listaService.delete(idlist);}


    @GetMapping(value = "api/todoListageneral")
    public TodoListaDTO get(@PathVariable("idlista") Long idlist){ return listaService.get(idlist);}



}
