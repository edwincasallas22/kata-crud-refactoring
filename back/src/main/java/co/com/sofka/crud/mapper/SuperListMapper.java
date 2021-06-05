
package co.com.sofka.crud.mapper;

import co.com.sofka.crud.dto.SuperListDTO;
import co.com.sofka.crud.entity.SuperList;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {TodoMapper.class})
public interface SuperListMapper {
    @Mappings({
            @Mapping(source = "groupId", target = "idlista"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "todos", target = "todos")})


    SuperListDTO toSuperListDTO(SuperList superList);

    Iterable<SuperListDTO> toSuperListDTOs(Iterable<SuperList> superLists);

    @InheritInverseConfiguration
    SuperList aSuperList(SuperListDTO superListDTO);
}