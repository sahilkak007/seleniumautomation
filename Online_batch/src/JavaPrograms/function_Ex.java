package JavaPrograms;

public class function_Ex 
{
	int  a=4;  //global  variables  or instance  variables
	int  b=10;  //instance  variables
	public  void  sum()  // non returnable  and non parameterized
	{  int  c;
	
     	c=a +b;
		System.out.println("Value of "+c);
		
	}
	//  non  returnable  and  parmaterised function
	public  void  mul(int  x, int y)
	{
		
		int  c=x*y;
		System.out.println(c);
	}
	
	public   int  sub()  // returnable  and non paramterised
	{
		
		int  c=b-a;
		//System.out.println(b-a);
		return c;
		
	}
	public   int  sub(int x, int y)  // returnable  and  paramterised
	{
		
		int  c=x-y;
		//System.out.println(b-a);
		return c;
		
	}
	
	
	
	public  static  void main(String args[])
	{  function_Ex   obj=new function_Ex ();
	
	 obj.sum();  //no parameters
	 obj.mul(5, 7);  //parameters
		
	 int  z=obj.sub();  //calling  function
	 System.out.println(z);
	 System.out.println(obj.sub());
		
	 int m=obj.sub(8, 4);
	 System.out.println(m);
	 
	}
	
	

}
