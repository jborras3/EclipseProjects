import java.util.Scanner;

public class MainCartes {
	
	
	
	public static void main(String[] args){
		
		String tipus = null;
		int selector = 0;
		int num = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("Inserte el tipo que quiere:");
		System.out.print("");
		System.out.print("1. Oro ");
		System.out.print("");
		System.out.print("2. Copas ");
		System.out.print("");
		System.out.print("3. Espadas ");
		System.out.print("");
		System.out.print("4. Bastones ");
		System.out.print("");
			
		selector = s.nextInt();

		if(selector == 1) {
			
			tipus = "Oro";
			
		}
		if(selector == 2) {
			
			tipus = "Copas";
			
		}
		if(selector == 3) {
					
			tipus = "Espadas";
					
		}
		if(selector == 4) {
			
			tipus = "Bastones";
			
		}
		
		System.out.print(tipus);
		
		while(num > 12 || num < 1) {
		System.out.print("");
		System.out.print("Inserte un numero entre el 1 y el 12 (ambos incluidos) ");
		num =  s.nextInt();
		}
		
		System.out.print("");
		System.out.print(num);
		
		

	}

}
