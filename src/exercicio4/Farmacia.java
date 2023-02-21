package exercicio4;

public class Farmacia {
	
	private String nomeProduto;
    private String categoria;
    private String codigoProduto;
    private String marca;
    private Double preco;

	public Farmacia() {
	}

	public Farmacia(String nomeProduto, String categoria, String codigoProduto, String marca, Double preco) {
		this.nomeProduto = nomeProduto;
		this.categoria = categoria;
		this.codigoProduto = codigoProduto;
		this.marca = marca;
		this.preco = preco;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void visulizar(){
        System.out.println(nomeProduto + ", " + categoria + ", " + codigoProduto + ", " + marca + ", "
                + String.format("%.2f",preco));
    }
}

