interface N
{
	default void show()
	{
		System.out.println("hello in show");
	}
	
}
class R 
{
	public void show()
	{
		System.out.println("hello in class");
	}
}
class S extends R implements N
{
	
}
public class Interface81Demo {

	public static void main(String[] args) {
	 
		S obj=new S();
		
		obj.show();
		
		
		
		

	}

}
