import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainStream {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String ubicacionFichero = "C:\\Users\\usuario\\Desktop\\pitufo.txt"; // ubicacion del arrxiu
		int size = 5;
		String[] data = new String[size];
		String aux;
		int countLector = 0;

		System.out.println("Inserti ruta absoluta del document a ordenar: (recorda que les barres son dues)");
		ubicacionFichero = s.next();



		System.out.println("Comença");

		try {
			BufferedReader lector = new BufferedReader(new FileReader(ubicacionFichero)); // declarar lector

			System.out.println("Arxiu obert");
			System.out.println(" ");

			try{
				while (countLector != 5) { //llegir lineas del fitxar

					data[countLector] = lector.readLine();
	
					System.out.println(data[countLector]);
	
					countLector++;
	
				}
			}catch(Exception e){
				System.out.println("Hi ha poques lines");
			}
			
			
			lector.close(); //cerrar lector

			for (int i = 0; i < (data.length - 1); i++) { //algoritme de ordenació

				for (int j = 0; j < data.length - i - 1; j++) {

					char[] primerString = Procesos.convertirStringToChar(data[j]); //transformar string a array de chars
					char[] segundoString = Procesos.convertirStringToChar(data[j + 1]);

					if (Procesos.comparadorChar(primerString, segundoString)) { //metode de validació si es mes gran o no
						aux = data[j + 1];
						data[j + 1] = data[j];
						data[j] = aux;
					}
				}
			}

		} catch (FileNotFoundException e) { // que fer si no troba el fitxer
			System.out.println("No es troba el fitxer");
		} catch (IOException e) { // que fer si hi ha un error en la lectura del fitxer
			System.out.println("No es pot llegir");
		}
		System.out.println(" ");
		System.out.println("Acabat");
		System.out.println(" ");
		try {
			BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\usuario\\Desktop\\words_sort.txt"));

			for (int o = 0; o < data.length; o++) {
				escritor.write(data[o] + "\n");
				System.out.println(data[o]);
			}

			escritor.close();

		} catch (IOException e) {
			System.out.println("Ruta erronea");
		}

		s.close();

	}

}