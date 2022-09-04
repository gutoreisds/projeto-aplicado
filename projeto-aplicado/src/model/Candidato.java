package model;

public class Candidato {

	private int id;
	private String nome;
	private String fichaLimpa;
	private String nomePartido;
	
	

	public Candidato(int id, String nome, String fichaLimpa, String nomePartido) {
		this.id = id;
		this.nome = nome;
		this.fichaLimpa = fichaLimpa;
		this.nomePartido = nomePartido;
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
		
	public String getNomePartido() {
		return nomePartido;
	}

	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}
	
	
	
	
}
