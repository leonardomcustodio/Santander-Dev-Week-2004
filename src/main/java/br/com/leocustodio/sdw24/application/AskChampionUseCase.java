package br.com.leocustodio.sdw24.application;

import br.com.leocustodio.sdw24.domain.exception.ChampionNotFoundException;
import br.com.leocustodio.sdw24.domain.model.Champion;
import br.com.leocustodio.sdw24.domain.ports.ChampionsRepository;

public record AskChampionUseCase(ChampionsRepository repository) {

    public String askChampion(Long championId, String question){

        Champion champion = repository.findById(championId)
            .orElseThrow(() -> new ChampionNotFoundException(championId));

        String championContex = champion.generateContextByQuestion(question);
        
        //TODO: Evoluir a logica de negocio para considerar a integracao com IAs Generativas
        
        return championContex;
    }
}