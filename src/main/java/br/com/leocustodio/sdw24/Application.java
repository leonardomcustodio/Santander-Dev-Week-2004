package br.com.leocustodio.sdw24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.leocustodio.sdw24.application.ListChampionsUseCase;
import br.com.leocustodio.sdw24.domain.ports.ChampionsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListChampionsUseCase provListChampionsUseCase(ChampionsRepository repository){
		return new ListChampionsUseCase(repository);
	}

}
