
public class Nombre {
	
	int num;
	String romano;
	String hex;
	int bin;

	private Nombre(int numEntrada) {
		num = numEntrada;
	}
	private Nombre(String romana) {
		romano = romana;
	}	
	public String getHex() {
		return hex;
	}
	public int getBin() {
		return bin;
	}
	
}
