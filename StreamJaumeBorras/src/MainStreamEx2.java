import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class MainStreamEx2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner s = new Scanner(System.in);

		String ubicacionFichero = "C:\\Users\\jborras3\\Desktop\\pitufo.txt"; // ubicacion del arrxiu
		/*int size = 5;
		String[] data = new String[size];*/
		String linea;
		int tamanyLinea = 0;
		int countTotalLineas = 0;

		/*System.out.println("Inserti ruta absoluta del document a ordenar: (recorda que les barres son dues)");
		ubicacionFichero = s.next();*/
		
		try {
		BufferedReader lector = new BufferedReader(new FileReader(ubicacionFichero)); //declarar lector
		System.out.println("Arxiu obert");
		
		do {
			linea = lector.readLine();
			char[] charArray = linea.toCharArray(); 
			if(charArray.length > tamanyLinea) {
				tamanyLinea = charArray.length; 
			}
			countTotalLineas++;
		}while(linea != null);// contador de lineas totales
		
		System.out.println("Total lineas"+ countTotalLineas);
		System.out.println("Total char"+ tamanyLinea);
		
		
		lector.close();
		} catch (FileNotFoundException e) { // que fer si no troba el fitxer
			System.out.println("No es troba el fitxer");
		} catch (IOException e) { // que fer si hi ha un error en la lectura del fitxer
			System.out.println("No es pot llegir");
		}
		
		

		
		
		
	}

}