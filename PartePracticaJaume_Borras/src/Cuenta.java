
public class Cuenta {
	
	String nombreCliente;	
	String numCuenta;
	double tipoInteres;
	double saldo;
	
	public Cuenta(String nombreCliente, String numCuenta, double tipoInteres, double saldo) {
		nombreCliente = nombreCliente;
		numCuenta = numCuenta;
		tipoInteres = tipoInteres;
		saldo = saldo;
	}
	
	public String getNombreCliente(String nombreCliente) {
		return nombreCliente;
	}
	
	public String getNumCuenta(String numCuenta) {
		return numCuenta;
	}
	
	public double getTipoInteres(double tipoInteres) {
		return tipoInteres;
	}
	
	public double getSaldo(double saldo) {
		return saldo;
	}
	
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
