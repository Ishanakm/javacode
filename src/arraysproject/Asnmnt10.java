package arraysproject;
 //array of length 5 ,fill the values and find its average
public class Asnmnt10 {

	public static void main(String[] args)
	{
    int num[]=new int[5];
    num[0]=5;
    num[1]=10;
    num[2]=15;
    num[3]=20;
    num[4]=25;
    int sum=0;
    for(int i=0;i<5;i++)
    {
   sum=sum+num[i];
    }
   double avg=sum/num.length;
 System.out.println("average is "+avg);
	}
}
