package br.com.leocustodio.sdw24.adapters.in;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leocustodio.sdw24.application.ListChampionUseCase;
import br.com.leocustodio.sdw24.domain.model.Champion;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Champions", description = "Endpoints of LOL's Champions domain.")
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionUseCase useCase) {
    
    @GetMapping
    public List<Champion> findAllChampions(){
        return useCase.findAll();
    }
}
