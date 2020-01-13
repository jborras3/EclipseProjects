public class Article {
	private int codi;
	private String descripcio;
	private double preuDeCompra;
	private double preuDeVenda;
	private int stock;

	public Article(){}
	
	public Article(int codi, String descripcio, double preuDeCompra, double preuDeVenda, int stock) {
		this.codi = codi;
		this.descripcio = descripcio;
		this.preuDeCompra = preuDeCompra;
		this.preuDeVenda = preuDeVenda;
		this.stock = stock;
	}
	
	public int getCodi() {
		return codi;
	}
	
	public void setCodi(int codi) {
		this.codi =codi ;
	}
	
	public String getDescripcio() {
		return descripcio;
	}
	
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	
	public double getPreuDeCompra() {
		return preuDeCompra;
	}
	
	public void setPreuDeCompra(double preuDeCompra) {
		this.preuDeCompra = preuDeCompra;
	}
	
	public double getPreuDeVenda() {
		return preuDeVenda;
	}
	
	public void setPreuDeVenda(double preuDeVenda) {
		this.preuDeVenda = preuDeVenda;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void imprimir() {
		String cadena = "-----------------------------------";
		cadena+="\nCodi: " + this.codi;
		cadena+="\nDescripcio: "+ this.descripcio;
		cadena+="\nPreu de compra: "+ this.preuDeCompra;
		cadena+="\nPreu de venda: "+ this.preuDeVenda;
		cadena+="\nStock: "+ this.stock;
		cadena+="\n---------------------------------------";
		cadena+="\n";
		System.out.print(cadena);
	}
}
