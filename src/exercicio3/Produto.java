package exercicio3;

public class Produto {

	private String nome;
	private String categoria;
	private String codigo;
	private Integer qtd;
	private Double valor;

	public Produto() {
	}

	public Produto(String nome, String categoria, String codigo, Integer qtd, Double valor) {
			this.nome = nome;
			this.categoria = categoria;
			this.codigo = codigo;
			this.qtd = qtd;
			this.valor = valor;
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void visulizar(){
        System.out.println(nome + ", " + categoria + ", " + codigo + ", " + qtd + ", " +
                String.format("%.2f",valor));
        
    }
}
	