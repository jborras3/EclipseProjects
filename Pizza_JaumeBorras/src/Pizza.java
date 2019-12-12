
public class Pizza {

	int countServides = 0;
	int countDemenades = 0;
	String tipusPizza;
	String estatPizza;
	String tamanyPizza;
	
	
	//constructor
	
	public Pizza(String tipus, String tamany) {
		tipusPizza = tipus;
		tamanyPizza = tamany;
		estatPizza = "demanada";
		countDemenades++;
		
	}
	
	//get's
	
	public String getTipusPizza(String tipusPizza) {
		
		return tipusPizza;
		
	}
	public String getTamanyPizza(String tamanyPizza) {
			
			return tamanyPizza;
			
		}
	public String getEstatPizza(String estatPizza) {
		
		return estatPizza;
		
	}
	
	public int getServides() {
		return countServides;
	}
	
	public int getDemenades() {
		return countDemenades;
	}
	
	//cambiar estado
	
	public void Servir() {
		 System.out.println("Aquesta pizza se ha servit");
	}
	
	//toString
	
	public String toString(){
		return "pizza "+tipusPizza+" "+tamanyPizza+" demenada";
	}
	
}
