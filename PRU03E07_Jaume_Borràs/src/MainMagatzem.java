import java.util.*;
public class MainMagatzem {

	public static void main(String[] args) {
		
		int selector = 0;
		
		Scanner s = new Scanner(System.in);
		Magatzem magatzem = new Magatzem();
		do{
			menu();
			
			selector = s.nextInt();
			
			switch (selector) {
				case 1:
					magatzem.listaArt();
					break;
				case 2:
					magatzem.altaArt();
					break;
				case 3:
					magatzem.baixaArt();
					break;
				case 4:
					magatzem.modArt();
					break;
				case 5:
					magatzem.entradaAtr();
					break;
				case 6:
					magatzem.sortidaAtr();
					break;
				default:
					selector = 7;
					break;
			}
		} while(selector != 7);
		
		System.out.println("Heu sortit del programa");

		s.close();
	}
	
	private static void menu() {
		System.out.println("'Menu': eligeix una opcio:");
		System.out.println("1. Llistat");
		System.out.println("2. Alta");
		System.out.println("3. Baixa");
		System.out.println("4. Modificació");
		System.out.println("5. Entrada de mercaderia");
		System.out.println("6. Sortida de mercaderia");
		System.out.println("7. Sortir");
	}
}
