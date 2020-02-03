package pru03.E02;

import java.util.Scanner;

public class PRU03E02TestCotxe_Jaume_Borras {

	public static void main(String[] args) {

		String marca = "Fiat";
		String model = "500";
		int selectorTipusMarxa;
		char x;
		int selectorMenu ; //mirar inicialitzar
		TipusCanvi tipusCanvi = TipusCanvi.CanviManual;
		CanviMarxa_Jaume_Borras c1 = new CanviMarxa_Jaume_Borras(marca, model, tipusCanvi);
		Scanner s = new Scanner(System.in);
		
		try {
			c1.arrancarMotor(); //encen motor
		}catch (Exception jaArrancat) {
	        System.out.println(jaArrancat.getMessage()); //llança la exepcio en cas de que no funcioni
		}    												//(En teoria es correcte)
	    
		
		System.out.println("El motor está: "+c1.comprovaMotor());
		
		try {
			c1.arrancarMotor();
		}catch (Exception jaArrancat) {
	        System.out.println(jaArrancat.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
	    }													//(En teoria es incorrecte)
		
		System.out.println(c1.getRevolucions()); //obtenim revelucions
		
		try {
			c1.aturarMotor();
		}catch (Exception jaAturat) {
	        System.out.println(jaAturat.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
	    }
		
		System.out.println(c1.getRevolucions());//obtenim revelucions (en aquest cas 0)
		
		try {
			c1.aturarMotor();
		}catch (Exception jaAturat) {
	        System.out.println(jaAturat.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
		}
		
		try {
			c1.arrancarMotor();
		}catch (Exception jaArrancat) {
	        System.out.println(jaArrancat.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
	    }													//(En teoria es incorrecte)
		/*
		
		*/

		System.out.println("Benvingut el menu");
		System.out.println("Eligeix la marca del cotxe");
		marca = s.next();
		System.out.println("Eligeix el model del cotxe");
		model = s.next();

		do{
		System.out.println("Eligeix el tipus de canvi del cotxe");
		System.out.println("[1] Canvi manual");
		System.out.println("[2] Canvi automatic");
		selectorTipusMarxa = s.nextInt();
		}while(selectorTipusMarxa != 1 && selectorTipusMarxa != 2);

		if(selectorTipusMarxa == 1){
			tipusCanvi = TipusCanvi.CanviManual;
		}else{
			tipusCanvi = TipusCanvi.CanviAutomatic;
		}

		CanviMarxa_Jaume_Borras c2 = new CanviMarxa_Jaume_Borras(marca, model, tipusCanvi);

		do{
			
			Menu();
			selectorMenu = s.nextInt();

			switch(selectorMenu){
				case 1: 
						try {
							c2.arrancarMotor(); //encen motor
						}catch (Exception jaArrancat) {
							System.out.println(jaArrancat.getMessage()); //llança la exepcio en cas de que no funcioni
						} 
						break;

				case 2: 
						try {
							c2.aturarMotor(); //atura motor
						}catch (Exception jaAturat) {
							System.out.println(jaAturat.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
						}
						break;
				
				case 3:
						System.out.println("El motor está: "+c2.comprovaMotor()); //comprova estat del motor
						break;
				
				case 4:
						System.out.println(c2.getRevolucions());//obtenim revelucions (en aquest cas 0)
						break;

				case 5:
					
					System.out.print("Vols pujar [+] o baixar [-] de marxa?");
					x = s.next().charAt(0);
						try {
							c2.canviarMarxaManual(x); //puja la marxa del cotxe
						}catch (Exception canviarMarxaN) {
							System.out.println(canviarMarxaN.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
						}
						break;
				
				case 6:
						try {
							c2.marxaEnrera();
						}catch (Exception enreraMarxaN) {
							System.out.println(enreraMarxaN.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
						}
						break;
			

				case 7:
						try {
							c2.posarMarxaN();
						}catch (Exception posarMarxaN) {
							System.out.println(posarMarxaN.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
						}
						break;
						
				default: 
						selectorMenu = 8;
						break;
				
			}

		}while(selectorMenu != 8);
		
		System.out.println("Heu sortit del programa");
		
		s.close();
	}

	private static void Menu() { // imprimeix menu
		System.out.println("Que desitja fer amb el cotxe?");
		System.out.println("[1] Arrancar	   [2] Aturar");
		System.out.println("[3] Comprovar estat del motor");
		System.out.println("[4] Comprovar revolucions");
		System.out.println("[5] Canviar marxa");
		System.out.println("[6] Marxa enrera   [7] Marxa neutre");
		System.out.println("[8] Sortir programa");
	}

}
