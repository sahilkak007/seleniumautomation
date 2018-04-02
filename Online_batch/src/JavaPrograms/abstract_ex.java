package JavaPrograms;

public abstract class abstract_ex {

	int  x=78,   y=3;
	//  non  abstract  method 
	public  void  sum()
	{
		System.out.println(x+y);
	}
		//abstract method
	public  abstract void mul();
	public static void main(String[] args) 
	{		 //creating a  object of  abstarct class  and  referrring to chile
		abstract_ex  obj=new child_ex();
  obj.sum();
  obj.mul();
		 
	}

}
