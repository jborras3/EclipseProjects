import java.util.Scanner;
import java.util.GregorianCalendar;

public class ExFechas {
	
		public static void main(String[] arg) {
			
			GregorianCalendar data = new GregorianCalendar();
			int day = (data.get(GregorianCalendar.DATE));
			int month = (data.get(GregorianCalendar.MONTH));
			int age = (data.get(GregorianCalendar.YEAR));
			System.out.println("Data actual: ");
			System.out.println("");
			System.out.println(day+"/"+month+"/"+age);
			System.out.println(data.getTime());
			System.out.println("");
			
			Scanner s = new Scanner(System.in);
			System.out.println("Introducir dia");
			System.out.println("");
			int dia = s.nextInt();
			System.out.println("Introducir mes");
			System.out.println("");
			int mes = s.nextInt();
			System.out.println("Introducir año");
			System.out.println("");
			int any = s.nextInt();
			System.out.println("Se procede la validacion de la fecha");
			int count = 0;
			int countDia = dia;
			int countMes = mes;
			int countAny = any;
			boolean x = true;
			System.out.println("");
			if(any >= 1){ //comprovar años
				count++;
			}
			
			if(mes <= 12 && mes >= 1) {//comprovar meses
				count++;
			}
			
			if(mes == 2 && any%4==0){//comprovar dias febrero bisiesto
				if(dia <= 29 && dia >= 0) {
					count++;
				}
				
			}
			
			if(mes == 2 &&  any%4 != 0){//comprovar dias febrero normal
				if(dia <= 28 && dia >= 0) {
					count++;
				}
				
			}
			
			if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && mes != 2) { //validar dias
				if (dia <= 30 && dia >=1) {
					count++;
				}
			else{
				if(dia <= 31 && dia >= 1 && mes != 2) {
					count++;
				}
			}
				
			if(count == 3) {
				x = true;
				System.out.println("Data introducida correcta, se procede a realizar la operación");
			}
			else {
				x = false;
				System.out.println("Data introducida erronea");
				count=0;
			}
			System.out.println("");
			System.out.println("Dias, meses y años hasta hoy");
			
			if(countDia!=day && countMes!=month && countAny!=age) {
				if(countAny!=age) {
					
					
					
				}
			}
		}
	}
		


}