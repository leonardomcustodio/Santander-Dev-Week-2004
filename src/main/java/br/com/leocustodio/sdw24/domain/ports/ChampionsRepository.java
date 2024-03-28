package br.com.leocustodio.sdw24.domain.ports;

import java.util.List;
import java.util.Optional;

import br.com.leocustodio.sdw24.domain.model.Champion;

public interface ChampionsRepository {
    
    List<Champion> findAll();

    Optional<Champion> findById(Long id);
}
