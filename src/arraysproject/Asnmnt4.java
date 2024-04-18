package arraysproject;

import java.util.Arrays;

//array length=4
//find out 34 is present or not
public class Asnmnt4 {

	public static void main(String[] args) 
	{
       int num[]=new int[4];
       num[0]=32;
       num[1]=1;
       num[2]=34;
       num[3]=45;
       Arrays.sort(num);
       int count=34;
       System.out.println(Arrays.toString(num));
      for(int i=0;i<num.length;i++)
      {
    	if(count==num[i])
    	{
    		System.out.println("34 is present");
    		}
    	 }
		
	}

}
