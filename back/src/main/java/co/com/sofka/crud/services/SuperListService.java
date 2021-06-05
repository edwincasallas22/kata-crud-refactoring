package co.com.sofka.crud.services;

import co.com.sofka.crud.dto.SuperListDTO;
import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entity.SuperList;
import co.com.sofka.crud.mapper.SuperListMapper;
import co.com.sofka.crud.repository.SuperListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuperListService {

    @Autowired
    private SuperListRepository superRepository;
    @Autowired // Inyeccion de dependencias
    private SuperListMapper superMapper;


    public Iterable<SuperListDTO> list(){
        Iterable<SuperList>superLists = superRepository.findAll();
        return superMapper.toSuperListDTOs(superLists);
    }

    public SuperListDTO save(SuperListDTO superListDTO){
        SuperList superList = superMapper.aSuperList(superListDTO);
        return  superMapper.toSuperListDTO(superRepository.save(superList));
    }

    public void delete(Long idlist){

        superRepository.delete(superMapper.aSuperList(get(idlist)));
    }

    public SuperListDTO get(Long idlist){

        return superMapper.toSuperListDTO(superRepository.findById(idlist).orElseThrow());
    }

}