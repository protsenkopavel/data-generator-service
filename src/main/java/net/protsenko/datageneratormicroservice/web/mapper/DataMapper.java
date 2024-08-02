package net.protsenko.datageneratormicroservice.web.mapper;

import net.protsenko.datageneratormicroservice.model.Data;
import net.protsenko.datageneratormicroservice.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
