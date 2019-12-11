
public class Cartes {

	//Atributos
	String coll;
	int numero;
	
	public Cartes(String tipus, int num) {
		coll = tipus;
		numero = num;
	}
	
	public String getTipus() {
		return coll;
	}
	
	public int getNumero() {
		return numero;
	}

	public void mostraC(){
		System.out.println(numero + " de " + coll);
	}
}
