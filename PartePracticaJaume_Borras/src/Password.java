
public class Password {
	
	int longitud;
	String password[];
	boolean x = true;
	
	public Password(int longitud, String[] password) {
		this.longitud = longitud;
		this.password = password;
	}
	
	public int getLongitud(int longitud) {
		return longitud;
		
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public void getPassword(String password[]) { 
	for(int i=0; i >= longitud; i++) {
		
		System.out.print(password[i] + "");
		
		}
	}
	
	public void EsFuerte(boolean x) {
		if(longitud > 6) {
			x = true;
		}
		else {
			x = false;
		}
		System.out.println(x);
	}
	
}
