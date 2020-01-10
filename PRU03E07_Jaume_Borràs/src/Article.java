import java.util.*;
public class Article {
	private static int codi = 0;
	private static String descripcio;
	private static double preuDeCompra;
	private static double preuDeVenda;
	private static int stock;
	private static Article[] article = new Article[100];
	static Scanner s = new Scanner(System.in);
	private static int countOb = 0;
	
	public Article(int codi, String descripcio, double preuDeCompra, double preuDeVenda, int stock) {
		codi = codi;
		descripcio = descripcio;
		preuDeCompra = preuDeCompra;
		preuDeVenda = preuDeVenda;
		stock = stock;
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
	
	public String toString() {
		String cadena = "-----------------------------------";
		cadena+="\nCodi: " + this.codi;
		cadena+="\nDescripcio: "+ this.descripcio;
		cadena+="\nPreu de compra: "+ this.preuDeCompra;
		cadena+="\nPreu de venda: "+ this.preuDeVenda;
		cadena+="\nStock: "+ this.stock;
		cadena+="\n---------------------------------------";
		return cadena;
	}
	
	public static void altaArt() {
		System.out.println("Opció alta de mercancía.");
		System.out.println("Inserti codi del article.");
		codi = s.nextInt();
		System.out.println("Inserti la descripcio del article.");
		descripcio = s.nextLine();
		System.out.println("Inserti el preu de compra del article. (Amb decimals)");
		preuDeCompra = s.nextDouble();
		System.out.println("Inserti el preu de venta del article. (Amb decimals)");
		preuDeVenda = s.nextDouble();
		System.out.println("Inserti el stock inicial del article.");
		stock = s.nextInt();
		Article n = new Article(codi, descripcio, preuDeCompra, preuDeVenda, stock);
		article[countOb] = n;
		System.out.println("Se ha introduït el article num: "+countOb+" a la llista. Les dades son les seguents: \nCodi: "+ codi+" ");
		countOb++;
	}
	
	public static void listaArt() {
		
		for(int i = 0; i == countOb; i++){
			article[i].toString();
		}
		
	}
}
