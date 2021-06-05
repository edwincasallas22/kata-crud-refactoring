package co.com.sofka.crud.controllers;

import co.com.sofka.crud.dto.SuperListDTO;
import co.com.sofka.crud.services.SuperListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SuperListController {

    @Autowired
    private SuperListService superListService;

    @GetMapping(value = "api/superListGenerals")
    public Iterable<SuperListDTO> list(){
        return superListService.list();
    }

    @PostMapping(value = "api/superListGeneral")
    public SuperListDTO save(@RequestBody SuperListDTO superListDTO){

        return superListService.save(superListDTO);
    }

    @PutMapping(value = "api/superListGeneral")
    public SuperListDTO update(@RequestBody SuperListDTO superListDTO){
        if(superListDTO.getIdlista() != null){
            return superListService.save(superListDTO);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "api/{id}/superListGeneral")
    public void delete(@PathVariable("idlista")Long idlista){
        superListService.delete(idlista);
    }

    @GetMapping(value = "api/{idlista}/superListGeneral")
    public SuperListDTO get(@PathVariable("idlista") Long idlista){
        return superListService.get(idlista);
    }


}