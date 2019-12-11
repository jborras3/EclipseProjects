import java.util.Scanner;

public class MainCartes {
	
	public static void main(String[] args){
		
		new MainCartes().inici();

	} 

	public void inici(){
		String tipus = "";
		int num = 0;
		int selector;
		Scanner s = new Scanner(System.in);

		System.out.println("Inserte el tipo que quiere:");
		System.out.println("1.Oro, 2.Bastos, 3.Copas, 4.Espadas");

		selector = s.nextInt();

		switch(selector){
			case 1: tipus = "Oro";
			case 2: tipus = "Bastos";
			case 3: tipus = "Copas";
			case 4: tipus = "Espadas";
		}
		
		while(num > 12 || num < 1) {
		System.out.println("Inserte un numero entre el 1 y el 12 (ambos incluidos) ");
		num = s.nextInt(); //demenar bum de carta
		}
	
		Cartes c1 = new Cartes(tipus, num); //contruir carta
		
		System.out.print(c1.getNumero());

		System.out.print(" - ");
		//print carta
		System.out.println(c1.getTipus());
		//print baralla
		Baraja b = new Baraja();

		b.mostrarBaraja();
		  
		s.close();
	}
}