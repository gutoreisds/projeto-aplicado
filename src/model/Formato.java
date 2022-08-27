package model;

public class Formato {

	public int id;
	public String formatoPesquisa;
	
	
	public Formato(String formatoPesquisa) {
		this.formatoPesquisa = formatoPesquisa;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFormatoPesquisa() {
		return formatoPesquisa;
	}
	public void setFormatoPesquisa(String formatoPesquisa) {
		this.formatoPesquisa = formatoPesquisa;
	}
	
	
}
