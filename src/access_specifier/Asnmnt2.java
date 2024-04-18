package access_specifier;
//for methods within the package
class parent
{
	public  void add()
	 {
		 
		 System.out.println("public");
	 }
	  protected  void sub()
	  {
		  System.out.println("protected");
	  }
	  private  void mul()
	  {
		  System.out.println("private");
	  }
	    void div()
	  {
		  System.out.println("package");
	  }
}
public class Asnmnt2 extends parent
{

	public static void main(String[] args)
	{
     Asnmnt2 a1=new Asnmnt2();
     a1.add();
     a1.div();
     a1.sub();
     //a1.mul(); private cannot be accessed
	}

}
