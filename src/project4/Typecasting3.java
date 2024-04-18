package project4;
//upcasting:c1-->c3
//downcasting:c3-->c1
class three
{
	void a()
	{
		
	}
}
class two extends three
{
	void b()
	{
		
	}
}
public class Typecasting3 extends two
{

	public static void main(String[] args) 
	{
           three t1=new Typecasting3(); //upcasting
           Typecasting3 a1=(Typecasting3) t1;
           a1.a();
           a1.b();
          t1.a();
         //cannot access class two with upcasting because we done upcasting from c1 to c3
	}

}
