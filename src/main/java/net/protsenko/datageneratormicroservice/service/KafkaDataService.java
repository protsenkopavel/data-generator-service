package net.protsenko.datageneratormicroservice.service;

import net.protsenko.datageneratormicroservice.model.Data;

public interface KafkaDataService {

    void send(Data data);

}
