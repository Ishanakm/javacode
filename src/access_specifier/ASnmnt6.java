package access_specifier;

import access_specifier2.Parent6;

//for class outside package
public class ASnmnt6 {

	public static void main(String[] args)
	{
      Parent6 p1=new Parent6();
      p1.add(0);//only public because outside package without sub becoming class 
     
      
    //  Parent7 p1=new Parent7();  
      
      
     // only public class can be accessed
	}

}
