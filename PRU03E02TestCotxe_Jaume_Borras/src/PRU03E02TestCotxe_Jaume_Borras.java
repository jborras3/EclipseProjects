
public class PRU03E02TestCotxe_Jaume_Borras {

	public static void main(String[] args) {
		
		String marca = "Fiat";
		String model = "500";
		TipusCanvi tipusCanvi = TipusCanvi.CanviAutomatic;
		PRU03E02Cotxe_Jaume_Borràs c1 = new PRU03E02Cotxe_Jaume_Borràs(marca, model, tipusCanvi);
		
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
	}

}
