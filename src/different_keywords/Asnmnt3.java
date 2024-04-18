package different_keywords;

import java.util.Scanner;

//Math class
public class Asnmnt3 {

	public static void main(String[] args)
	{
      double pi= Math.PI;
      System.out.println(pi);
      
      Scanner s1=new Scanner(System.in);
     // System.out.println( Math.subtractExact(s1.nextInt(), s1.nextInt()));      //from scannerclass
      System.out.println( Math.addExact(34, 23));//int,int
      System.out.println(Math.addExact(23, 1234156789));//int,long System.out.println(Math.multiplyExact(1, 20));
      System.out.println( Math.max(12, 10));
      System.out.println(Math.min(pi, 34.34));
      System.out.println( Math.sqrt(4));
      System.out.println( Math.random());//it gives a unique value everytime. it is lesser than 1 and greater than 0
    
      
      
     //random
      for(int i=0;i<3;i++)
      {
    	 
    	  System.out.println( Math.random());
    	 
      }
      
      
	}
	
	
	
	
	

}
