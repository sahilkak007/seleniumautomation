package JavaPrograms;

public class classA {

	public static void main(String[] args) 
	{
		
		Static_ex    obj=new Static_ex();		
		   
		System.out.println(obj.y);
		System.out.println(obj.z);
		
		//call  the  variable  x  in  a  static  way
		System.out.println(Static_ex.x);
		
		//call  the  variable  x  in   non sttaic  way
		  System.out.println(obj.x);
		

	}

}
