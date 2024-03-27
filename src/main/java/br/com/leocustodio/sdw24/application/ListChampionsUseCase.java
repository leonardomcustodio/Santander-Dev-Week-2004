package br.com.leocustodio.sdw24.application;

import java.util.List;

import br.com.leocustodio.sdw24.domain.model.Champions;
import br.com.leocustodio.sdw24.domain.ports.ChampionsRepository;

public record ListChampionsUseCase(ChampionsRepository repository) {

    public List<Champions> findAll(){
        return repository.findAll();
    }

}