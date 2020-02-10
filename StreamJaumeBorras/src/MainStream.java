import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
public class MainStream {

	public static void main(String[] args){
		
		String ubicacionFichero = "C:\\Users\\jborras3\\Desktop\\pitufo.txt";
		String data = "Oscar es un payaso";
		int bufferSize = 8 * 1024;
		
		try {
			OutputStreamWriter outputStreamWriter =
			    new OutputStreamWriter(
			        new BufferedOutputStream(
			              new FileOutputStream(ubicacionFichero),
			              bufferSize),"UTF-8");
			outputStreamWriter.write(data);
			outputStreamWriter.close();
		
		} catch (Exception e) {
			System.out.print("Esto no funciona");
		}	
		
	
	}

}
