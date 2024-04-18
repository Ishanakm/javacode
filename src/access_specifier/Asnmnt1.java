package access_specifier;
//for method within the class
public class Asnmnt1
{
 public static void add()
 {
	 
	 System.out.println("public");
 }
  protected static void sub()
  {
	  System.out.println("protected");
  }
  private static void mul()
  {
	  System.out.println("private");
  }
   static void div()
  {
	  System.out.println("package");
  }
	public static void main(String[] args) //all 4 Access Specifier can be accessed
	{
      sub();
      div();
      mul();
      add();
      }

}
