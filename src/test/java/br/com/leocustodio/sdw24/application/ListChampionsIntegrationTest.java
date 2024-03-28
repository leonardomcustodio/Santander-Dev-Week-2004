package br.com.leocustodio.sdw24.application;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.leocustodio.sdw24.domain.model.Champion;

@SpringBootTest
public class ListChampionsIntegrationTest {

    @Autowired
    private ListChampionUseCase listChampionsUseCase;

    @Test
    public void testListChampions(){
        List<Champion> champions = listChampionsUseCase.findAll();

        Assertions.assertEquals(12, champions.size());
    }
    
}
