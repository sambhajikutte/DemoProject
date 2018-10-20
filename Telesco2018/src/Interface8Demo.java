interface I
{
	void add();
	
	default void show()
	{
		System.out.println("hello in show");
	}
	
}
interface J
{
	void sub();
	default void show()
	{
		System.out.println("hello in show     j");
	}
}

class C implements I,J
{
	public void add() {
		System.out.println("hello in add");
	}
	public void sub() {
		System.out.println("hello in sub");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		J.super.show();
	}
}
public class Interface8Demo {

	public static void main(String[] args) {
	 
		C obj=new C();
		
		obj.show();
		obj.add();
		obj.sub();
		
		

	}

}
