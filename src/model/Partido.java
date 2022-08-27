package model;

public class Partido {

	public int id;
	public String sigla;
	public String nome;
	
	public Partido(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
