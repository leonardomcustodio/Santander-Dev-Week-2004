package br.com.leocustodio.sdw24.application;

import java.util.List;

import br.com.leocustodio.sdw24.domain.model.Champion;
import br.com.leocustodio.sdw24.domain.ports.ChampionsRepository;

public record ListChampionUseCase(ChampionsRepository repository) {

    public List<Champion> findAll(){
        return repository.findAll();
    }

}