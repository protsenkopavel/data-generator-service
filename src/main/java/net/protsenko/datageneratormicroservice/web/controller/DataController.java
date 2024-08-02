package net.protsenko.datageneratormicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import net.protsenko.datageneratormicroservice.model.Data;
import net.protsenko.datageneratormicroservice.model.test.DataTestOptions;
import net.protsenko.datageneratormicroservice.service.KafkaDataService;
import net.protsenko.datageneratormicroservice.service.TestDataService;
import net.protsenko.datageneratormicroservice.web.dto.DataDto;
import net.protsenko.datageneratormicroservice.web.dto.DataTestOptionsDto;
import net.protsenko.datageneratormicroservice.web.mapper.DataMapper;
import net.protsenko.datageneratormicroservice.web.mapper.DataTestOptionsMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto dto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(dto);
        testDataService.sendMessages(testOptions);
    }

}
