package model;

import java.time.LocalDate;


public class Pesquisa {

	private int id;
	private String instituto;
	private LocalDate dataPesquisa;
	private String uf;
	private String descricaoPesquisa;
	private String formatoPesquisa;
	private String tipoDePesquisa;
	private int mediaidade;
	
	
	
	
	public Pesquisa(int id, String instituto, LocalDate dataPesquisa, String uf, String descricaoPesquisa,
			String formatoPesquisa, String tipoDePesquisa, int mediaidade) {
		super();
		this.id = id;
		this.instituto = instituto;
		this.dataPesquisa = dataPesquisa;
		this.uf = uf;
		this.descricaoPesquisa = descricaoPesquisa;
		this.formatoPesquisa = formatoPesquisa;
		this.tipoDePesquisa = tipoDePesquisa;
		this.mediaidade = mediaidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstituto() {
		return instituto;
	}
	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}
	public LocalDate getDataPesquisa() {
		return dataPesquisa;
	}
	public void setDataPesquisa(LocalDate dataPesquisa) {
		this.dataPesquisa = dataPesquisa;
	}
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getDescricaoPesquisa() {
		return descricaoPesquisa;
	}
	public void setDescricaoPesquisa(String descricaoPesquisa) {
		this.descricaoPesquisa = descricaoPesquisa;
	}
	public String getFormatoPesquisa() {
		return formatoPesquisa;
	}
	public void setFormatoPesquisa(String formatoPesquisa) {
		this.formatoPesquisa = formatoPesquisa;
	}
	public String getTipoDePesquisa() {
		return tipoDePesquisa;
	}
	public void setTipoDePesquisa(String tipoDePesquisa) {
		this.tipoDePesquisa = tipoDePesquisa;
	}
	public int getMediaidade() {
		return mediaidade;
	}
	public void setMediaidade(int mediaidade) {
		this.mediaidade = mediaidade;
	}
	
	
	
}
