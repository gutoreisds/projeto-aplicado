package model;

import java.time.LocalDate;

public class Pesquisa {

	private int id;
	private String instituto;
	private LocalDate dataPesquisa;
	private Uf uf;
	private TipoPesquisa tipoPesquisa;
	private Formato formato;
	private Tipo tipo;
	private int mediaidade;
	
	
	public Pesquisa(String instituto, LocalDate dataPesquisa, Uf uf, int mediaidade) {
		this.instituto = instituto;
		this.dataPesquisa = dataPesquisa;
		this.uf = uf;
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
	public Uf getUf() {
		return uf;
	}
	public void setUf(Uf uf) {
		this.uf = uf;
	}
	public TipoPesquisa getTipoPesquisa() {
		return tipoPesquisa;
	}
	public void setTipoPesquisa(TipoPesquisa tipoPesquisa) {
		this.tipoPesquisa = tipoPesquisa;
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public int getMediaidade() {
		return mediaidade;
	}
	public void setMediaidade(int mediaidade) {
		this.mediaidade = mediaidade;
	}
	
	
	
}
