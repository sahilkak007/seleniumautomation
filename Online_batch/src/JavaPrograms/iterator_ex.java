package JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterator_ex {

	
	public  static void main(String[]  args)
	{
		
		
		  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
		  al.add("Ravi");//adding object in arraylist  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
	//Iterator<String>  itr=al.iterator();
		  
		  ListIterator<String>  itr=al.listIterator();
		//  System.out.println(itr.next());
		 // System.out.println(itr.next());
		 while(itr.hasNext())
		  {
			  System.out.println(itr.next());
			  
		  }
		 
		 while(itr.hasPrevious())
		 {
			 
			 System.out.println(itr.previous());
		 }

		
	}
}
