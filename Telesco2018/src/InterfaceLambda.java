interface abcde
{
	
	void show();
	
	
	
}
public class InterfaceLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abcde obj= ()-> System.out.println("helo1");
			
		
		obj.show();
		
	}

}
