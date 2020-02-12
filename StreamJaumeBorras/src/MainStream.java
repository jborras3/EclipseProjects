import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainStream {

	public static void main(String[] args){
		
		String ubicacionFichero = "C:\\Users\\jborras3\\Desktop\\pitufo.txt"; //ubicacion del arrxiu
		int size = 5;
		String[] data = new String[size];
		char[] paraula1 = new char[11];
		char[] paraula2 = new char[11];
		int countLector = 0;
		int countChar = 0;
		int countParaula = 0;
		char tmp;
		
		System.out.println("Comenca");
		
			try
	        {
	            BufferedReader lector = new BufferedReader(new FileReader(ubicacionFichero)); //declarar lector
	            
	            System.out.println("Arxiu obert");
	            System.out.println(" ");
	            
	            while(countLector != 5) {
	            	
	            	data[countLector] = lector.readLine();
	            	
	            	System.out.println(data[countLector]);
	            	
	            	countLector++;
	            	
	            }
	            
	            lector.close();
	            
	            System.out.println(" ");
	            
		} catch (FileNotFoundException e) { // que fer si no troba el fitxer
			System.out.println("No es troba el fitxer");
		} catch (IOException e) { // que fer si hi ha un error en la lectura del fitxer
			System.out.println("No es pot llegir");
		}	
			
		System.out.println("Acabat");
		
				//hacer lo de ethan porfa pls
		
		while(countPalabra != 5) {
			
		}
		
			
	}
		
	
}


