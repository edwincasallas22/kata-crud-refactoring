
package co.com.sofka.crud.mapper;

import co.com.sofka.crud.dto.SuperListDTO;
import co.com.sofka.crud.entity.SuperList;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper (componentModel = "spring")
public interface SuperListMapper {
    @Mappings({
            @Mapping(source = "id" , target = "id"),
            @Mapping(source = "name" , target = "name")})

    public SuperListDTO toSuperListDTO(SuperList superList);
    Iterable<SuperListDTO> toSuperListDTOs (Iterable<SuperList> superLists);

    @InheritInverseConfiguration
    SuperList aSuperList(SuperListDTO superListDTO);
}
