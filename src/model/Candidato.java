package model;

public class Candidato {

	private int id;
	private String nome;
	private String fichaLimpa;
	private Partido partido;
	
	public Candidato(String nome, String fichaLimpa, Partido partido) {
		this.nome = nome;
		this.fichaLimpa = fichaLimpa;
		this.partido = partido;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFichaLimpa() {
		return fichaLimpa;
	}
	public void setFichaLimpa(String fichaLimpa) {
		this.fichaLimpa = fichaLimpa;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
	
	
	
}
