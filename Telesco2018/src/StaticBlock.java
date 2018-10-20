
public class StaticBlock 
{
	static StaticBlock x=null;
	static
	{
		StaticBlock.x= new StaticBlock();
		
		String s=x.toString();
		System.out.println(s);
		
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(x);

	}

}
