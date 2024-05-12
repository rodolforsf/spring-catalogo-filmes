package br.com.rr.catalogofilmes;

import br.com.rr.catalogofilmes.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogofilmesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CatalogofilmesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=friends+&Season=1&apikey=6ce6e40e");
		System.out.println(json);

	}
}
