package net.protsenko.datageneratormicroservice.service;

import net.protsenko.datageneratormicroservice.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessages(DataTestOptions testOptions);

}
