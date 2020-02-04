package pru03.E02;

import java.util.Scanner;

public class PRU03E02TestCotxe_Jaume_Borras {

	public static void main(String[] args) {

		String marca = "Fiat";
		String model = "500";
		int selectorTipusMarxa;
		char masOmenos;
		int selectorMenuManual;
		int selectorMenuAuto;
		TipusCanvi tipusCanvi = TipusCanvi.CanviManual;
		PRU03E03_Jaume_Borras c1 = new PRU03E03_Jaume_Borras(marca, model, tipusCanvi);
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
		System.out.println(""); //com fer un enter en un doc
		System.out.println("");

		System.out.println("Benvingut el menu"); //inici de programa
		System.out.println("Eligeix la marca del cotxe");
		marca = s.next();
		System.out.println("");
		System.out.println("Eligeix el model del cotxe");
		model = s.next();
		System.out.println("");

		do{
		System.out.println("Eligeix el tipus de canvi del cotxe"); //selector de tipus de marxa
		System.out.println("[1] Canvi manual");
		System.out.println("[2] Canvi automatic");
		selectorTipusMarxa = s.nextInt();
		}while(selectorTipusMarxa != 1 && selectorTipusMarxa != 2);

		if(selectorTipusMarxa == 1){ //segons el numero defineix un o l'altre
			tipusCanvi = TipusCanvi.CanviManual;
		}else{
			tipusCanvi = TipusCanvi.CanviAutomatic;
		}

		PRU03E03_Jaume_Borras c2 = new PRU03E03_Jaume_Borras(marca, model, tipusCanvi);
		
		if(c2.getTipusMarcha().equals(TipusCanvi.CanviManual)) { //menu del cotxe manual
			
			do{
				System.out.println("");
				MenuManual();
				try {                                   //comprova si es un numero o no
					selectorMenuManual = s.nextInt();
				}catch(Exception nonNumero) {
					System.out.println("Caracter no aceptat");
					selectorMenuManual = 9;
				}
				System.out.println("");

				switch(selectorMenuManual){
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
							masOmenos = s.next().charAt(0);
							System.out.println("");
							try {
								c2.canviarMarxaManual(masOmenos); //puja la marxa del cotxe
							}catch (Exception canviarMarxaN) {
								System.out.println(canviarMarxaN.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
							}
							break;
					case 6:
						c2.getMarxa();//obtenim la marxa
						break;
					
					case 7:
							try {
								c2.marxaEnrera();
							}catch (Exception enreraMarxaN) {
								System.out.println(enreraMarxaN.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
							}
							break;
				

					case 8:
							try {
								c2.posarMarxaN();
							}catch (Exception posarMarxaN) {
								System.out.println(posarMarxaN.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
							}
							break;
							
					default: 
							selectorMenuManual = 9;
							break;
					
				}

			}while(selectorMenuManual != 9);
			
			
		}else { //menu del cotxe automatic
			
			do {
				
				System.out.println(" ");
				MenuAutomatic();
				try {                                   //comprova si es un numero o no
					selectorMenuAuto = s.nextInt();
				}catch(Exception nonNumero) {
					System.out.println("Caracter no aceptat");
					selectorMenuAuto = 7;
				}
				System.out.println(" ");
				
				switch(selectorMenuAuto){
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
					c2.getMarxa();//obtenim la marxa
					break;

				case 6:
						System.out.print("Vols pujar [+] o baixar [-] de marxa?");
						masOmenos = s.next().charAt(0);
						System.out.println("");
						try {
							c2.canviMarxaAuto(masOmenos);//puja la marxa del cotxe
						}catch (Exception canviarMarxaN) {
							System.out.println(canviarMarxaN.getMessage()); //llança una resposta a la exepcio en cas de que no funcioni
						}
						break;
					
				default: 
					selectorMenuAuto = 7;
					break;
				}
				
			}while(selectorMenuAuto != 7);
			
		}
		
		System.out.println("Heu sortit del programa");
		
		s.close();
	}

	private static void MenuManual() { // imprimeix menu del manual
		System.out.println("Que desitja fer amb el cotxe?");
		System.out.println("[1] Arrancar	   [2] Aturar");
		System.out.println("[3] Comprovar estat del motor");
		System.out.println("[4] Comprovar revolucions");
		System.out.println("[5] Comprovar marxa");
		System.out.println("[6] Canviar marxa");
		System.out.println("[7] Marxa enrera   [8] Marxa neutre");
		System.out.println("[9] Sortir programa");
	}
	
	private static void MenuAutomatic() {
		System.out.println("Que desitja fer amb el cotxe?");
		System.out.println("[1] Arrancar	   [2] Aturar");
		System.out.println("[3] Comprovar estat del motor");
		System.out.println("[4] Comprovar revolucions");
		System.out.println("[5] Comprovar marxa");
		System.out.println("[6] Canvi de marxa");
		System.out.println("[7] Sortir programa");
	}

}
