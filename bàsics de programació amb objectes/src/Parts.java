
public class Parts {

	public static int x = 7; 
	public int y = 3; 
	
	
		Parts a = new Parts(); 
		Parts b = new Parts();
	
	a.y = 5;
	b.y = 6; 
	a.x = 1; 
	b.x = 2;
	System.out.println(a.y); // 5
	System.out.println(b.y); // 6
	System.out.println(a.x); // 1
	System.out.println(b.x); // 2
}
