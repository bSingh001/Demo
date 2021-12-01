/**
 * 
 */

/**
 * @author Brandon
 *
 */
public class Employee
{
	private String name;
	private String address;
	private int number;
	
	public Employee(String n,String a, int num)
	{
		name = n;
		address = a;
		number = num;
		
	}
	
	public void mailCheck()
	{
		System.out.println("Mailing a check to " + this.name + " "+this.address);
		
	}   
	
	public String toString()
	{
		return name + " " + number+ " "+ address;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String newAddress)
	{
		address = newAddress;
	}
	
}


