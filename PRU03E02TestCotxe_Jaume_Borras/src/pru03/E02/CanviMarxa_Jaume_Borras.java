package pru03.E02;

public class CanviMarxa_Jaume_Borras extends PRU03E02Cotxe_Jaume_Borràs {

	private MarxesAuto_Jaume_Borras marxaAuto;
	private MarxesManual_Jaume_Borras marxaManual;
	private MarxesManual_Jaume_Borras marxaInternaAuto;

	
	public CanviMarxa_Jaume_Borras(String marca, String model, TipusCanvi tipuscanvi) { //constructorde la clase
		super(marca, model, tipuscanvi);

		if(this.tipuscanvi == TipusCanvi.CanviManual){ //eligeix quina variable utilitzar segons el tipus de canvi
			tornaManual(); //manual
		}else{ 
			tornaAuto(); //automatic
		}//no tenc capacitat de fer un metode per tonar 2 tipus diferents

		this.estat = EstatsMotorCotxe.Aturat; //Cull l'atribut per defecte del enum
	}

	/*Metodes per els canvis de marches manuals*/

	
	public void canviarMarxaManual(char x) throws Exception {
		
		if(x != '+' && x != '-') { //si no es el char que correspon envia un error
			throw new Exception ("Selecona be la acció per favor");
		}
		
		if(x == '+') {
			
			if(this.marxaManual == MarxesManual_Jaume_Borras.R){ //Si esta en R primer posar marxa N
				throw new Exception ("Per pujar a Primera previament has de colocar la Neutre");
			}
			if(this.marxaManual == MarxesManual_Jaume_Borras.Sexta){//no es pot pujar més de la sexta
				throw new Exception ("No pots pujar més de la Sisena");
			}
			if( true != comprovadorEstatMotor()){//si está apagat no pot pujar de marcha
				throw new Exception ("Encen primer el cotxe");
			}
			pujarMarxa(); //puja la marxa del cotxe
				
		}
		
		if(x == '-') {

			if(this.marxaManual == MarxesManual_Jaume_Borras.R){ //Si esta en R no pots baixar de marxa
				throw new Exception ("Si esta en la marxa R no pots baixar de marxa");
			}
			if(this.marxaManual == MarxesManual_Jaume_Borras.N){ //no es pot baixar més de la neutre
				throw new Exception ("No pots baixar més de la Neutre");
			}
			if( true != comprovadorEstatMotor()){ //si está apagat no pot pujar de marcha
				throw new Exception ("Encen primer el cotxe");
			}
			
			baixarMarxa(); //baixa la marxa del cotxe
			
		}
	}
	
	public void pujarMarxa(){ //puja una marxa al cotxe manual cridant els metodes inferiors
		
		pujarMarxa6(); //puja a la marxa 6
		
		pujarMarxa5(); //puja a la marxa 5
		
		pujarMarxa4(); //puja a la marxa 4
		
		pujarMarxa3(); //puja a la marxa 3
		
		pujarMarxa2(); //puja a la marxa 2
		
		pujarMarxa1(); //puja a la marxa 1 desde el neutre
		
	}

	//Les marxes no estàn enumerades al estat inicial, sino a la que puja

		private void pujarMarxa1() { //puja a la marxa 1
			if(this.marxaManual == MarxesManual_Jaume_Borras.N && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Primera;
				System.out.println("Se a posat la Primera marxa");
			}
		}

		private void pujarMarxa2() { //puja a la marxa 2
			if(this.marxaManual == MarxesManual_Jaume_Borras.Primera && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Segona;
				System.out.println("Se a posat la Segona marxa");
			}
		}
		private void pujarMarxa3() { //puja a la marxa 3
			if(this.marxaManual == MarxesManual_Jaume_Borras.Segona && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Tercera;
				System.out.println("Se a posat la Tercera marxa");
			}
		}

		private void pujarMarxa4() { //puja a la marxa 4
			if(this.marxaManual == MarxesManual_Jaume_Borras.Tercera && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Quarta;
				System.out.println("Se a posat la Quarta marxa");
			}
		}

		private void pujarMarxa5() {
			if(this.marxaManual == MarxesManual_Jaume_Borras.Quarta && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Quinta;
				System.out.println("Se a posat la Quinta marxa");
			}
		}

		private void pujarMarxa6() {
			if(this.marxaManual == MarxesManual_Jaume_Borras.Quinta && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Sexta;
				System.out.println("Se a posat la Sexta marxa");
			}
		}

	
	public void baixarMarxa(){ 

		baixaMarxa1(); //baixa a la primera marxa

		baixaMarxa2(); //baixa a la segona marxa

		baixaMarxa3(); //baixa a la tercera marxa

		baixaMarxa4(); //baixa a la quarta marxa

		baixaMarxa5(); //baixa a la cinquena marxa

	}

	//Els metodes de baixar marxa estàn enumeras a la marxa que baixes, no a la que estàs

		private void baixaMarxa1() { //baixa a la primera marxa
			if(this.marxaManual == MarxesManual_Jaume_Borras.Segona && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Primera;
				System.out.println("Se a posat la Primera marxa");
			}
		}
		private void baixaMarxa2() { //baixa a la segona marxa
			if(this.marxaManual == MarxesManual_Jaume_Borras.Tercera && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Segona;
				System.out.println("Se a posat la Segona marxa");
			}
		}

		private void baixaMarxa3() { //baixa a la tercera marxa
			if(this.marxaManual == MarxesManual_Jaume_Borras.Quarta && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Tercera;
				System.out.println("Se a posat la Tercera marxa");
			}
		}

		private void baixaMarxa4() { //baixa a la quarta marxa
			if(this.marxaManual == MarxesManual_Jaume_Borras.Quinta && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Quarta;
				System.out.println("Se a posat la Quarta marxa");
			}
		}

		private void baixaMarxa5() { //baixa a la cinquena marxa
			if(this.marxaManual == MarxesManual_Jaume_Borras.Sexta && comprovadorEstatMotor() ){
				marxaManual = MarxesManual_Jaume_Borras.Quinta;
				System.out.println("Se a posat la Quinta marxa");
			}
		}
	
	public void posarMarxaN() throws Exception { //posa la marxa N
		if(this.marxaManual == MarxesManual_Jaume_Borras.N) { //si ja està en la marxa N llança la excepció
			throw new Exception("Ja estàs en la marxa neutre");
		}
		
		if(this.marxaManual == MarxesManual_Jaume_Borras.Primera && comprovadorEstatMotor() ){ //si està en primera posa la marxa neutre
			marxaManual = MarxesManual_Jaume_Borras.N;
			System.out.println("Se a posat la marxa N");
		} 
		if(this.marxaManual == MarxesManual_Jaume_Borras.R && comprovadorEstatMotor() ){ //si està marxa enrera posa la marxa neutre
			marxaManual = MarxesManual_Jaume_Borras.N;
			System.out.println("Se a posat la marxa N");
		}
		if(comprovadorEstatMarxaperN()){ //Si no esta en R o en Primera no pots posar la N
			throw new Exception ("Si esta en la marxa R no pots baixar de marxa");
		}
		if( true != comprovadorEstatMotor()){ //si el motor no està ences no pots fer res
			throw new Exception ("Si el motor no està ences no pots fer res");
		}
	}
	
	public void marxaEnrera() throws Exception {
		if(this.marxaManual == MarxesManual_Jaume_Borras.R) { //si ja està en la marxa R llança la excepció
			throw new Exception("Ja estàs en marxa enrera");
		}
		
		if(this.marxaManual == MarxesManual_Jaume_Borras.N && comprovadorEstatMotor() ){ //si està en neutre i ences posa la marxa enrera
			marxaManual = MarxesManual_Jaume_Borras.R;
			System.out.println("Se a posat la marxa Enrera");
		}
		
		if(true != comprovadorEstatMotor()){ //si està apagat llança la excepció
			throw new Exception("Encen el motor");
		}
		if(this.marxaManual != MarxesManual_Jaume_Borras.N) { //si no està en la marxa Neutre llança la excepció
			throw new Exception("Coloquet primer en la marxa Neutre");
		}
		
		

	}
	
	/*Metodes de les marxes automatiques*/

	public void canviMarchaAuto(char x) throws Exception { //canvia la marxa automatica
		
		if(x != '+' && x != '-') { //si no es el char que correspon envia un error
			throw new Exception ("Selecona be la acció per favor");
		}
		
		if( true != comprovadorEstatMotor()){ //si el motor no està ences no pots fer res
			throw new Exception ("Si el motor no està ences no pots fer res");
		}
		if(marxaAuto == MarxesAuto_Jaume_Borras.R && x == '-') { //salten al sobrepasar el limit de baixada
			throw new Exception ("No pots menys de R");
		}
		if(marxaAuto == MarxesAuto_Jaume_Borras.F && x == '+') { //salten al sobrepasar el limit de pujada
			throw new Exception ("No pots més de F");
		}
		
		/*Insertar metodes de pujada i baixada*/
		
		if(marxaAuto == MarxesAuto_Jaume_Borras.F && x == '-') { //coloca la marxa de F a N
			marxaAuto = MarxesAuto_Jaume_Borras.N;
			System.out.println("Se ha colocat la marxa Neutre");
		}
		
		if(marxaAuto == MarxesAuto_Jaume_Borras.N && x == '-') { //coloca la marxa de N a R
			marxaAuto = MarxesAuto_Jaume_Borras.R;
			System.out.println("Se ha colocat la marxa Enrera");
		
		}
		
		if(marxaAuto == MarxesAuto_Jaume_Borras.N && x == '+') { //coloca la marxa de N a F
			marxaAuto = MarxesAuto_Jaume_Borras.F;
			System.out.println("Se ha colocat la marxa F");
		
		}
		
		if(marxaAuto == MarxesAuto_Jaume_Borras.R && x == '+') { //coloca la marxa de R a N
			marxaAuto = MarxesAuto_Jaume_Borras.N;
			System.out.println("Se ha colocat la marxa N");
		}
		
	}


	/*Metodes heredats*/
	
	@Override
	public void aturarMotor() throws Exception { //cambia el estat del motor EnMarxa a Aturat
		if(this.estat == EstatsMotorCotxe.EnMarxa) {
			this.estat = EstatsMotorCotxe.Aturat;
	        System.out.println("El cotxe se ha aturat i ara està "+EstatsMotorCotxe.Aturat+".");
		}else {
			throw new Exception ("El motor ja està "+this.estat+"."); //en cas de estar aturat llança la excepcio
		}

		marxaManual = MarxesManual_Jaume_Borras.N; //al aturar el motor es posa la N automaticament (sino es perillos)
		marxaAuto = MarxesAuto_Jaume_Borras.N;
	}

	
	/*Metodes privats*/	

	private MarxesManual_Jaume_Borras tornaManual() { //torna la posicio de la marxa neutral en manual
		return this.marxaManual = MarxesManual_Jaume_Borras.N;
	}

	private MarxesAuto_Jaume_Borras tornaAuto() { //torna la posicio de la marxa neutral en automatic
		return this.marxaAuto = MarxesAuto_Jaume_Borras.N;
	}

	private boolean comprovadorEstatMotor() { //comprova si el motor està ences
		if(this.estat == EstatsMotorCotxe.Aturat){ //si està aturat evidentment no pot cambiar de marxa
			return false;
		}else{  //si està ences si
			return true;
		}
	}

	private boolean comprovadorEstatMarxaperN() { //comprova si es pot posar la marxa N
		if(this.marxaManual == MarxesManual_Jaume_Borras.R && this.marxaManual == MarxesManual_Jaume_Borras.Primera){
			return true; //si es primera o es cap enrera si que es pot posar la N
		}else{
			return false; //sino no
		}
		
	}

}