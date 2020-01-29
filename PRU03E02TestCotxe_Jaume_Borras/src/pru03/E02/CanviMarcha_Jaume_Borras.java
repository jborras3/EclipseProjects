package pru03.E02;

public class CanviMarcha_Jaume_Borras extends PRU03E02Cotxe_Jaume_Borràs {

	private MarxesManual_Jaume_Borras marxaManual;
	private MarxesAuto_Jaume_Borras marxaAuto;
	
	public CanviMarcha_Jaume_Borras(String marca, String model, TipusCanvi tipuscanvi, MarxesManual_Jaume_Borras marxaManual) {
		super(marca, model, tipuscanvi);
		this.marxaManual = marxaManual;
	
	}
	
	public CanviMarcha_Jaume_Borras(String marca, String model, TipusCanvi tipuscanvi, MarxesAuto_Jaume_Borras marxaAuto) {
		super(marca, model, tipuscanvi);
		this.marxaAuto = marxaAuto;
	
	}
	
	

	public MarxesManual_Jaume_Borras pujarMarxa() { //modificar futurment
		return  MarxesManual_Jaume_Borras.N ;
	}
	
	public MarxesManual_Jaume_Borras baixarMarxa() { //modificar futurment
		return  MarxesManual_Jaume_Borras.N ;
	}
	
	
	

}
