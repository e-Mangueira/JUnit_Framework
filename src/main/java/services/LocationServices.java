package services;

import java.util.Date;
import static utilities.DateUtility.adicionarDias;

import entities.Location;
import entities.Movie;
import entities.User;

public class LocationServices {
	
	public Location alugarFilme(User usuario, Movie filme) {
		Location locacao = new Location();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...
		//TODO adicionar método para salvar
		
		return locacao;
	}
}