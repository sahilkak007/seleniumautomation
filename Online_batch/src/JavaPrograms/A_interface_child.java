package JavaPrograms;

public class A_interface_child   implements  A_interface
{

	
	public void sum() 
	{
		System.out.println(x+y);
		
	}

	
	public void mul() 
	{
		System.out.println(x*y);
		
	}
	
	
	public  static void main(String[]  args)
	{
		A_interface obj=new  A_interface_child();
		obj.sum();
		obj.mul();
		
	}
	

}
