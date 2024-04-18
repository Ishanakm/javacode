  package project4;
//upcasting:c1-->c2
//downcasting:c2-->c1
 class teacher //c3
 {
	 void sweet()
	 {
		 
	 }
 }
 class mentor extends teacher //c2
 {
	 void moon()
	 {
		 
	 }
 }
public class Typecasting2 extends mentor //c1
{
	void noon()
	{
		
	}

	public static void main(String[] args) 
	{
      mentor m1=new Typecasting2(); //upcasting
      Typecasting2 t1=(Typecasting2) m1;//downcasting
      m1.moon();
      m1.sweet();
      t1.noon();
      t1.moon();
      t1.sweet();
	}

}
