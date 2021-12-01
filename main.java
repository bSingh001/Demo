
public class main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		salary s = new salary("brandon","jhb, Midrand", 01 , 5000);
		Employee e = new salary("Matthew","Pollard",02,3000);
		
		System.out.println("Call the mailcheck using salary reference");
		s.mailCheck();
		
		
		System.out.println("\n Call the mailcheck using employee reference");
		e.mailCheck();
		
		

	}

}
