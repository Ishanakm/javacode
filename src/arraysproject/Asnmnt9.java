package arraysproject;

import java.util.Scanner;

//find out whether  space is present  
//check the index
public class Asnmnt9 {

	public static void main(String[] args) 
	{
		//System.out.println("enter the string");
		//Scanner s1=new Scanner(System.in);
      String a="man 1";
      char[] a1=a.toCharArray();
      for(int i=0;i<a.length();i++)
      {
    	  boolean ansr=Character.isSpaceChar(a1[i]); 
    	  if(ansr==true)
    	  {
    		  System.out.println("space is present");
      }
    	  }
      System.out.println("the index of the space is "+a.indexOf(a));
      }
	

}
