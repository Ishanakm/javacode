package different_keywords;
//Thread.sleep
public class Asnmnt2 {

	public static void main(String[] args) throws InterruptedException 
	{
   for(int i=1;i<10;i++)
   {
	   System.out.println(i);
	   Thread.sleep(1000);//it delays each output by 1 second
   }
	}

}
