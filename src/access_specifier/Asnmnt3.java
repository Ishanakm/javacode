package access_specifier;

import access_specifier2.Parent_;

//for methods outside the package by becoming sub class
public class Asnmnt3 extends Parent_
{

	Asnmnt3() 
	{
		System.out.println("constructor2");
	}

	public static void main(String[] args) 
	{
      Asnmnt3 a1=new Asnmnt3();
      a1.add(0);
      a1.sub();
      //private and package cannot be accessed
	}

}
