package model;

public class Principal {

	public static void main(String[] args) {
		
		Candidato c1 = new Candidato(1, "Ciro Gomes", "Sim", "PDT");
		Candidato c2 = new Candidato(2, "Felipe D Avila", "Sim", "NOVO");
		Candidato c3 = new Candidato(3, "Jair Bolsonaro", "Sim", "PL");
		Candidato c4 = new Candidato(4, "Leo Pericles", "Sim", "UP");
		Candidato c5 = new Candidato(5, "Lula", "Sim", "PT");
		Candidato c6 = new Candidato(6, "Pablo Marcal", "Sim", "PROS");
		Candidato c7 = new Candidato(7, "Simone Tebet", "Sim", "MDB");
		Candidato c8 = new Candidato(8, "Sofia Manzano", "Sim", "PCB");
		Candidato c9 = new Candidato(9, "Vera", "Sim", "PSTU");

		System.out.println("Id: " + c1.getId() + " Candidato: " + c1.getNome()+ " Ficha Limpa: " + c1.getFichaLimpa() + " Partido: " + c1.getNomePartido());
		
		
		Pesquisa p1 = new Pesquisa(1, "Data Folha", null, "SC", "Censo utilizando metodologia estatística com margem de erro", "telefone", "qualitativa", 45);
		
		
		System.out.println("Id: " + p1.getId() + " Instituto: " + p1.getInstituto() + " Data: " + p1.getDataPesquisa() + " Estado: " + p1.getUf() + " Descrição: " + p1.getDescricaoPesquisa() + " Formato: " + p1.getFormatoPesquisa() + " Tipo de Pesquisa: " + p1.getTipoDePesquisa() + " Média de idade:  " + p1.getMediaidade());
		
		CandidatoXPesquisa cp1 = new CandidatoXPesquisa(10000, c1, p1);
		
		System.out.println("Número de votos: " + cp1.getVotos() + " Candidato: " + cp1.getCandidato() + " Pesquisa: " + cp1.getPesquisa());

	}

}
