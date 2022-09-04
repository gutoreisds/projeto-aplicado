package model;


public class CandidatoXPesquisa {

		private int id;
		private int votos;
		private Candidato candidato;
		private Pesquisa pesquisa;
		
		
		public CandidatoXPesquisa(int votos, Candidato candidato, Pesquisa pesquisa) {
			this.votos = votos;
			this.candidato = candidato;
			this.pesquisa = pesquisa;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getVotos() {
			return votos;
		}
		public void setVotos(int votos) {
			this.votos = votos;
		}
		public Candidato getCandidato() {
			return candidato;
		}
		public void setCandidato(Candidato candidato) {
			this.candidato = candidato;
		}
		public Pesquisa getPesquisa() {
			return pesquisa;
		}
		public void setPesquisa(Pesquisa pesquisa) {
			this.pesquisa = pesquisa;
		}
		
		
	}



