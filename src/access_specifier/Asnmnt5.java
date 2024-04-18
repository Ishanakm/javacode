//only public and package can be accessible for class//

package access_specifier;
//for class within the package

public class Asnmnt5 
{

	public static void main(String[] args)
	{
        Parent5 a1=new Parent5();//public
        a1.add(0);
        a1.div();
        a1.sub();
        
        Parent_5 a2=new Parent_5();//package
        a2.add(0);
        a2.div();
        a2.sub();
        //public and package can be accessed
	}

}
