package exercicio5;

import java.time.LocalTime;

public class Ingresso {
		
		private String nome;
	    private String cpf;
	    private String qtdIngressos;
	    private LocalTime horario;
	    private Double valor;

		public Ingresso() {
		}

		public Ingresso(String nome, String cpf, String qtdIngressos, LocalTime horario, Double valor) {
			this.nome = nome;
			this.cpf = cpf;
			this.qtdIngressos = qtdIngressos;
			this.horario = horario;
			this.valor = valor;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getQtdIngressos() {
			return qtdIngressos;
		}

		public void setQtdIngressos(String qtdIngressos) {
			this.qtdIngressos = qtdIngressos;
		}

		public LocalTime getHorario() {
			return horario;
		}

		public void setHorario(LocalTime horario) {
			this.horario = horario;
		}

		public Double getValor() {
			return valor;
		}

		public void setValor(Double valor) {
			this.valor = valor;
		}

		public void visulizar(){
	        System.out.println(nome + ", " + cpf + ", " + qtdIngressos + ", " + horario + ", "
	                + String.format("%.2f",valor));
	    }
	}
