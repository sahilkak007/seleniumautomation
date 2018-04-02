package JavaPrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<String>     l1=new ArrayList<String>();
		
		
		List<String>     l1=new LinkedList<String>();
		l1.add("xyz1");
		l1.add("abc");
		l1.add("mnp");
		l1.add("pqr");
		l1.add("pqr");
		
		l1.add(2, "abcd3");
		
		
		for(String  obj:l1)
		{
		
		    System.out.println(obj);
			
		}
		}
		
	}

