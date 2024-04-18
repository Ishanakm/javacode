package different_keywords;
//assert keyword
//by default assertion will be off
//we need to right click slect run as run configuration click argument then under vmarguments type -ea
public class Asnmnt4 {

	public static void main(String[] args) 
	{
    String name="isha";
    
	assert name.length()>10:"seems like lenth is lesser than condition";//checking the condition(precondition)
	for(int i=0;i<name.length();i++)
	{
		System.out.println(name.concat(" of ayaz"));
	}
	
	
	
	}

}
