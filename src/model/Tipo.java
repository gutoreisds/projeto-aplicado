package model;

public class Tipo {

	public int id;
	public String tipoPesquisa;
	
	
	public Tipo(String tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipoPesquisa() {
		return tipoPesquisa;
	}
	public void setTipoPesquisa(String tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}
	
}
