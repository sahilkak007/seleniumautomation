package JavaPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Ex {

	public static void main(String[] args) {
		
	Set<String>   l1=new HashSet<String>();
		
	//Set<String>   l1=new LinkedHashSet<String>();
       l1.add("abc");
       l1.add("xyz");
       l1.add("mnp");
       l1.add("qrs");
       l1.add("mnp");
      
	
      // System.out.println(l1);
       
       for(String obj:l1)
       {
    	   
    	   System.out.println(obj);
       }
       
	}

}
