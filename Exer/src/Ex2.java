
public class Ex2 {

	public static void main(String[] args) {
		
		 int num1=15;
		 int num2=57;
		 int countentre=0;
		 int par=0;
		 int sumaimpar=0;
		 
		 System.out.println("El numero 1 es "+num1);
		 
		 System.out.println("El numero 2 es "+num2);
		 
		 if(num1>num2) {
			 
			 countentre= num1-num2;
			 
			 System.out.println("Hay "+countentre+" entre los dos numeros");
			 
			 System.out.println("Listado de numeros que hay entre los dos:");
			 
			 while(num1>num2) {
				 num2++;
				 System.out.println(num2);
				 
				 if((num2%2)==0) {
					 par=par++;
				 }
				  else {
						 sumaimpar=sumaimpar+num1;
				 }
			 }		
		 }
		 
		 else {
			 countentre= num2-num1;
			 
			 System.out.println("Hay"+countentre+" entre los dos numeros");
			 
			 System.out.println("Listado de numeros que hay entre los dos:");
			 
			 while(num2>num1) {
				 num1++;
				 System.out.println(num1);
				 
				 if((num1%2)==0) {
					 par=par++;
				 }
				  else {
						 sumaimpar=sumaimpar+num2;
				 }
			 }
			 
		 }
		 
		 System.out.println("El total de los impares és "+sumaimpar);
		 
	}
}