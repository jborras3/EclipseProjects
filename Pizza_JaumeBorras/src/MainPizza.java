import java.util.*;
public class MainPizza {

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String tipus;
		String tamany;
		int selector;
		int numPizzas;
		int count = 0;
		
		selector = 0;
		
		System.out.println("Cuentes pizzes vols?");
		 numPizzas = s.nextInt();
		 
		 Pizza[] pizza = new Pizza[numPizzas];
		 
		while(count < numPizzas) {
			if(selector > 0 || selector < 4 ) {
			System.out.println("Tamany? 1.petita 2.mitjana 3.familiar");
			selector = s.nextInt();
			}
			switch(selector) {
				case 1: tamany = "petita";
					break;
				case 2: tamany = "mitjana";
					break;
				case 3: tamany = "familiar";
					break;
				default: tamany = "mitjana";
					break;
			}
			
			selector = 0;
			
			if(selector > 0 || selector < 6 ) {
			System.out.println("Tipus? 1.Hawaiana 2.Fungi 3.Barbacoa 4.Atún 5.4 quesos");
				selector = s.nextInt();
			}
			switch(selector) {
				case 1: tipus = "Hawaiana";
					break;
				case 2: tipus = "Fungi";
					break;
				case 3: tipus = "Barbacoa";
					break;
				case 4: tipus = "Atún";
			 		break;
				case 5: tipus = "4 quesos";
					break;
				default: tipus= "Hawaiana"; 
					break;
			}
			
			selector = 0;
			
			pizza[count] = new Pizza(tipus, tamany);
			
			count++;
		}
		
	}

}
