
public class salary extends Employee
{
	private int salary; //annual salary
	
	public salary(String name,String address,int number,int salary)
	{
		super(name,address, number);
		setSalary(salary);
	}
	
	public void mailCheck()
	{
		System.out.println("mailing check to "+getName() + " with a salary of "+ salary);
	}
	
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int newSalary)
	{
		if(newSalary > 0)
		{
			salary = newSalary;
		}
	}public int SalaryPayment()
	{
		System.out.println("computing salary pay for "+ getName());
		return salary /52;
	}
	
	
}
