package br.com.rr.catalogofilmes;

import br.com.rr.catalogofilmes.model.DadosSerie;
import br.com.rr.catalogofilmes.service.ConsumoApi;
import br.com.rr.catalogofilmes.service.ConverteDados;
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
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=friends&apikey=6ce6e40e");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
