package project4;
//upcasting:c2--->c3
//downcasting:c2--->c1
class apple
{
	void add()
	{
		
	}
}
class mango extends apple
{
	void tree()
	{
		
	}
	static void wow()
	{
		
	}
}
class gua extends mango
{
	void fruit()
	{
		
	}
}
public class Typecasting4 extends gua
{

	public static void main(String[] args) 
	{
        mango m1=new gua();//upcasting
        gua g1=new Typecasting4();
        Typecasting4 t1=(Typecasting4) g1; //downcasting
        m1.add();
        m1.tree();
        m1.wow();
        t1.add();
        t1.fruit();
        t1.tree();
        t1.wow();
        g1.fruit();
        g1.wow();
        t1.tree();
        t1.add();
	}

}
