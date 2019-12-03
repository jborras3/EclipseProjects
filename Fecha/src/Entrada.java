import java.util.Scanner;

public class Entrada {

	//vamos a insertar Strings, Int y Double
	
	public static void main(String[] args) {
		
		//1r llamamos clase Scanner
		Scanner s = new Scanner(System.in);
		
		//2n Declarar variable
		String nombre = "";
		int edad = 0;
		double userAltura = 0.0;
		
		//3r pedir entrada al usuario
		System.out.print("Cual es tu nombre? ");
		nombre = s.next(); // metodo para pedir string
		System.out.print("Que edad tienes? ");
		edad = s.nextInt(); //metodo para pedir double
		System.out.print("Cuanto mides? (Ejemplo 1,75) ");
		userAltura = s.nextDouble(); //metodo para pedir double
		
		//4t usamos las variables introducidas
		
		System.out.println("Tu nombre es: "+nombre+".");
		System.out.println("Tienes "+edad+" años.");
		System.out.println("Haces "+userAltura+"m de altura.");
		
	}

}