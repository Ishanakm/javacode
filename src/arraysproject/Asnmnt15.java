package arraysproject;
//swap numbers without third variable
import java.util.Scanner;

public class Asnmnt15 {

	public static void main(String[] args)
	{
		 Scanner s1=new Scanner(System.in);
	       int num1=s1.nextInt();
	       int num2=s1.nextInt();
	       num1=num2+num1;
	       num2=num1-num2;
	       num1=num1-num2;
	       System.out.println(num1);
	       System.out.println(num2);
	}

}
