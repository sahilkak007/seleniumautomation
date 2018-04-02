package JavaPrograms;

public class Static_ex {

	/*static  members
	 * 
	 *  1. variables 
	 *  2. functions
	 * 
	 */
	static int  x=3;  //  static  variable
	int y=5; //non  static  way
	 int  z=9;  //non static  way
	
	public  static  void  sum(int x, int y)
	{  
		int c;
		
		c=x+y;
		
		System.out.println(c);
		
	}
	
	public  void  mul()
	{
		
		System.out.println(x*y);
	}
	
	
	public static void main(String[] args)
	
	{
		 //  1.  way  accesing   the variable   via  static  way
		
		System.out.println(x);
			
		Static_ex    obj=new Static_ex();		
		   
		System.out.println(obj.y);
		System.out.println(obj.z);
		
	//	sum();
		obj.mul();
	}

}
