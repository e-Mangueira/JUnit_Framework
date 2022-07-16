package entities;

import java.util.Date;

public class Location {

	private User usuario;
	private Movie filme;
	private Date dataLocacao;
	private Date dataRetorno;
	private Double valor;
	
	public User getUsuario() {
		return usuario;
	}
	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public Date getDataRetorno() {
		return dataRetorno;
	}
	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Movie getFilme() {
		return filme;
	}
	public void setFilme(Movie filme) {
		this.filme = filme;
	}
}