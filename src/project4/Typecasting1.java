package project4;
//upcasting:c1-->c2
//downcasting:c2-->c1

class teacher1 //c2
{
	static void add()
	{
		
	}
	void sub()
	{
		
	}
}
public class Typecasting1 extends teacher1 //c1
{

	public static void main(String[] args)
	{
	      teacher1 t1=new Typecasting1();//upcasting
	      t1.sub();
	      t1.add();
	      Typecasting1 c1=(Typecasting1) t1;//downcasting. there should be upcasting to do downcasting
	      
	}

}
