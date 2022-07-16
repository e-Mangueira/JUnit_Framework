package application;

import java.util.Date;

import entities.Location;
import entities.Movie;
import entities.User;
import services.LocationServices;
import utilities.DateUtility;

public class LocationTest {

	public static void main(String[] args) {
		
		//cenario
		LocationServices service = new LocationServices();
		User usuario = new User("Usuario 1");
		Movie filme = new Movie("Filme 1", 2, 5.0);
		
		//acao
		Location locacao = service.alugarFilme(usuario, filme);
		
		//verificacao
		
		System.out.println("\n=== Teste 1: Checa apenas os valores - não caracteriza um tests =====");
		
		System.out.println(locacao.getValor());
		System.out.println(locacao.getDataLocacao());
		System.out.println(locacao.getDataRetorno());
		
		
		//Opção de teste, porém muito depentente porque não é dinâmico
		System.out.println("\n=== Teste 2: Checa se está tudo correto - caracteriza um teste =====");
		
		System.out.println(locacao.getValor() == 5.0);
		System.out.println(DateUtility.isMesmaData(locacao.getDataLocacao(), new Date()));
		System.out.println(DateUtility.isMesmaData(locacao.getDataRetorno(), DateUtility.obterDataComDiferencaDias(1)));

	}

}
