package access_specifier2;
//parent class of Asnmnt3
public class Parent_ 
{
	 public Parent_()
	{
		System.out.println("constructor");
	}
	public  void add(int d)
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
