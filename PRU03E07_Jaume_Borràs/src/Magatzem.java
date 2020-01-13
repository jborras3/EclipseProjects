import java.util.*;
public class Magatzem{
    Scanner s = new Scanner(System.in);
    private static Article[] articleList = new Article[100];
    private static int articleCode = 0;
    private int n;
    private int slc;

    public void altaArt() {
        Article article = new Article();
        System.out.println("Opció alta de mercancía.");
        article.setCodi(getArticleCode());
        System.out.println("El codi del article és: " + getArticleCode() + ".");
        System.out.println("Inserti la descripcio del article.");
        String descripcion = s.next(); //a vegades no funciona el nextline a partir de se segona iteniració, no se que fer per aixo domes esta el next
        article.setDescripcio(descripcion);
        System.out.println("Inserti el preu de compra del article. (Amb decimals)");
        article.setPreuDeCompra( s.nextDouble());
		System.out.println("Inserti el preu de venta del article. (Amb decimals)");
		article.setPreuDeVenda(s.nextDouble());
		System.out.println("Inserti el stock inicial del article.");
        article.setStock(s.nextInt());
        getArticleList()[article.getCodi()] = article;
        articleCode = getArticleCode() + 1;
		System.out.println("Se ha introduït el article num: "+article.getCodi()+" a la llista. Les dades son les seguents: \nCodi: "+article.getCodi()+" Descripcio: "+article.getDescripcio()+"\nPreu de compra: "+article.getPreuDeCompra()+" Preu de venta: "+article.getPreuDeVenda()+" Stock: "+article.getStock()+" .");
	}
	
	public void listaArt() {
		for (Article article : getArticleList()) {
            if(article != null){
                article.imprimir();
            }
        }
	}

	public void baixaArt() {
		
		System.out.println("Inserti el codi del objecte que vol eliminar");
        n = s.nextInt();
        while(n > articleList.length || n < 0 || articleList.length == 0){
            System.out.println("Han hagut problemes eliminant l'article, inserta un codi vàlid");
            n = s.nextInt();    
        }
        
        getArticleList()[n] = null;
        System.out.println("Article eliminat");
	}

	public void modArt() {
        System.out.println("Inserti el codi del objecte que vol modificar");
        n = s.nextInt();
		while(n > getArticleList().length || n < 0 || getArticleList().length == 0 || getArticleList()[n] == null){
            System.out.println("Han hagut problemes trobant l'article, inserta un codi vàlid");
            n = s.nextInt();
        }

        Article article = getArticleList()[n];
		System.out.println("Inserti sobre que vol modifica del article");
		System.out.println("1. Descripció.");
		System.out.println("2. Preu de compra del article.");
		System.out.println("3. Preu de venta del article.");
		System.out.println("4. Stock");

		slc = s.nextInt();

		switch (slc) {
            case 1:
                System.out.println("Inserta Descripció.");
                String descripcion = s.next(); //per alguna raó que desconeix no funciona el nextline
				article.setDescripcio(descripcion);
				break;
            case 2:
                System.out.println("Inserta Preu de compra del article.");
				article.setPreuDeCompra(s.nextDouble());
				break;
            case 3:
                System.out.println("Inserta Preu de venta del article.");
				article.setPreuDeVenda(s.nextDouble());
				break;
            case 4:
                System.out.println("Inserta Stock");
				article.setStock(s.nextInt());
				break;
			default:
				break;
        }
        
        getArticleList()[article.getCodi()] = article;
	}

	public void entradaAtr() {
		System.out.println("Inserti el codi sobre que vol modifica del article");
        n = s.nextInt();
        while(n > getArticleList().length || n < 0 || getArticleList().length == 0){
            System.out.println("Inserti un codi valid");
            n = s.nextInt();
        }
        Article article = getArticleList()[n];

		System.out.println("Inserti la cantidad de entrada del article");
		slc = s.nextInt();
        article.setStock(article.getStock() + slc);
        getArticleList()[article.getCodi()] = article;
		System.out.println("Ara te "+article.getStock()+" de "+article.getDescripcio()+" amb el codi: "+article.getCodi());
	}

	public void sortidaAtr() {
		System.out.println("Inserti el codi sobre que vol modifica del article");
        n = s.nextInt();
        while(n > getArticleList().length || n < 0 || getArticleList().length == 0){
            System.out.println("Inserti un codi valid");
            n = s.nextInt();
        }
        Article article = getArticleList()[n];
		System.out.println("Inserti la cantidad de sortida del article");
		slc = s.nextInt();
		while(article.getStock() - slc < 0){
			System.out.println("Inserti una cantidad valida");
			slc = s.nextInt();
		}
        article.setStock(article.getStock() - slc);
        getArticleList()[article.getCodi()] = article;
		System.out.println("Ara te "+article.getStock()+" de "+article.getDescripcio()+" amb el codi: "+article.getCodi());
	}

    public Article[] getArticleList() {
        return articleList;
    }

    public int getArticleCode() {
        return articleCode;
    }
}