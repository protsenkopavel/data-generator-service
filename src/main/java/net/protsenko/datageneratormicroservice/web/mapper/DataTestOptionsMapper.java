package net.protsenko.datageneratormicroservice.web.mapper;

import net.protsenko.datageneratormicroservice.model.test.DataTestOptions;
import net.protsenko.datageneratormicroservice.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
