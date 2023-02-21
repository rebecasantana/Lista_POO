package exercicio6;

public class Curso {

	private String nomeCurso;
    private String tipo;
    private String duracao;
    private String qualFaculdade;
    private Double valorMensalidade;

	public Curso() {
	}

	public Curso(String nomeCurso, String tipo, String duracao, String qualFaculdade, Double valorMensalidade) {
		this.nomeCurso = nomeCurso;
		this.tipo = tipo;
		this.duracao = duracao;
		this.qualFaculdade = qualFaculdade;
		this.valorMensalidade = valorMensalidade;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String qualFaculdade() {
		return qualFaculdade;
	}

	public void setqualFaculdade(String qualFaculdade) {
		this.qualFaculdade = qualFaculdade;
	}

	public Double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(Double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	public void visualizar() {
        System.out.println(nomeCurso + ", " + tipo + ", " + duracao + ", " + qualFaculdade
                + ", " + String.format("%.2f",valorMensalidade));
    }
}