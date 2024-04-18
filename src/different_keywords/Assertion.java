package different_keywords;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assertion {

	public static void main(String[] args)
	{
		int age[]=new int[3];
		age[0]=1;
		age[1]=1;
		age[2]=1;
		
		int parentage[]=new int[3];
		parentage[0]=1;
		parentage[1]=1;
		parentage[2]=1;
		
		assert Array.getLength(age)>2;
		boolean answer=Arrays.equals(age, parentage);
		System.out.println(answer);
		
	}

}
