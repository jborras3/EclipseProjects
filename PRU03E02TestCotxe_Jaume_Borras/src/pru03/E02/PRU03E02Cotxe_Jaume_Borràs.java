package pru03.E02;
import java.util.Random;
public class PRU03E02Cotxe_Jaume_Borràs extends CotxeAbstracte{

    protected EstatsMotorCotxe estat;
    static Random aleatori = new Random(); //cream objecte de aleatori per fer les revolucions

	public PRU03E02Cotxe_Jaume_Borràs(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
        this.estat = EstatsMotorCotxe.Aturat; //Cull l'atribut per defecte del enum
    }

    //Fer metodos

	@Override
    public void arrancarMotor() throws Exception {	//cambia el estat del motor Aturat a EnMarxa
		if(this.estat == EstatsMotorCotxe.Aturat){
		        this.estat = EstatsMotorCotxe.EnMarxa;
		        System.out.println("El cotxe se ha engegat i ara està "+EstatsMotorCotxe.EnMarxa+".");
		}else {
			throw new Exception ("El motor ja estaba "+this.estat+"."); //en cas de estar en marxa llança la excepcio
		}
	}
	

	@Override
	public EstatsMotorCotxe comprovaMotor() { //torna estat delcotxe a travès de la variable estat
		return this.estat;
	}

	@Override
	public int getRevolucions() { //comprovar estat del cotxe i segons el resultat tornar un valor
        if(this.estat.equals(EstatsMotorCotxe.Aturat)){ //si esta aturat torna 0
            return 0;
        }
        else{ //sino, torna numero aleatori entre 1 i 6500
        	
            return Aleatori();//la variable random es un numero aleatori
        }
	}

	@Override
	public void aturarMotor() throws Exception { //cambia el estat del motor EnMarxa a Aturat
		if(this.estat == EstatsMotorCotxe.EnMarxa) {
			this.estat = EstatsMotorCotxe.Aturat;
	        System.out.println("El cotxe se ha aturat i ara està "+EstatsMotorCotxe.Aturat+".");
		}else {
			throw new Exception ("El motor ja està "+this.estat+"."); //en cas de estar aturat llança la excepcio
		}
		
	}
	
	private int Aleatori(){ //generar numero aleatori amb la clase creada anteriorment
	    return aleatori.nextInt(6500);
	}

}