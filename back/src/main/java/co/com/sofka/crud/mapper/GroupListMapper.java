package co.com.sofka.crud.mapper;

import co.com.sofka.crud.dto.GroupListDTO;
import co.com.sofka.crud.dto.TodoDTO;
import co.com.sofka.crud.entity.Todo;
import org.mapstruct.InheritInverseConfiguration;
import co.com.sofka.crud.entity.GroupList;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface GroupListMapper {
/*
    //Convertir los atributos de una clase entidad a una dominio
    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "name",target = "name")
    })
    //Recibe una entidad y me lo convierte en un tododto
    GroupListDTO toGrouplist(GroupList grouplist);
    Iterable<GroupListDTO> toGrouplistDTO (Iterable<GroupList> groupLists);

    @InheritInverseConfiguration
    GroupList toGrouplist(GroupListDTO todoDTO);
 */
    GroupListDTO modelodto (GroupList grouplist);
    GroupList modelo (GroupListDTO grouplistDTO);
    List<GroupListDTO> toGrouplistDTO(List <GroupList> groupLists);
}

