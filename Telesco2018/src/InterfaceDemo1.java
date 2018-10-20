interface abcd
{
	
	void show();
	
}
class rahul implements abcd{
	
	public void show() {
		System.out.println("hello");
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		
		
		abcd obj=new rahul()
				{
			public void show() {
				System.out.println("anonymous class");
			}
				};
		
		obj.show();
		
		
		
		
	
	}

}