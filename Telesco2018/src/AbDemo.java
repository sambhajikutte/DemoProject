abstract class abc     //abstract class
{
	abstract public void show();
	
	public void draw() {
		
		System.out.println("draw");
	
	}
}

class man extends abc  //concrete class
{
	public void show()
	{
		System.out.println("show");
	}
}
public class AbDemo {

	public static void main(String[] args) {
		
		abc obj =new man();
		
		obj.show();
		obj.draw();
		

	}

}
