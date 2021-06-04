
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
        if(superListDTO.getId() != null){
            return superListService.save(superListDTO);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "api/{id}/superListGeneral")
    public void delete(@PathVariable("id")Long id){
        superListService.delete(id);
    }

    @GetMapping(value = "api/{id}/superListGeneral")
    public SuperListDTO get(@PathVariable("id") Long id){
        return superListService.get(id);
    }


}
