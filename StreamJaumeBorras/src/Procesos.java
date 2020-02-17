public class Procesos {

    static int comprovador;
    static boolean validor;
    static char[] charArray;
    static int count = 0;
        
	public static char[] convertirStringToChar(String a) { //String to charArray
        charArray = a.toCharArray(); 
        return charArray;
    }
    

    public static boolean comparadorChar(char[] primerString, char[] segundoString) {
     try {

        do{
        
            if (primerString[count] > segundoString[count]) { //si 1 es més gran que dos = true (que se intercabin)
                comprovador = 2;
                validor = true;
            }
            if( primerString[count] < segundoString[count]){ //si 2 es més gran que dos = false (que no se intercabin)
                comprovador = 1;
                validor = false;
            }
            if( primerString[count] == segundoString[count]){ //si les lletres son iguals es passa a la seguent
                comprovador = 0;
            }


            count++;

        }while(comprovador == 0);

        count = 0;
        
            } catch (Exception e) { //ern cas que siguin molt iguals i un arriba a null s'alta la excepcio
            System.out.println("Una de les dues paraules son massa iguals");
        }
        
     return validor;
    
    }
}
