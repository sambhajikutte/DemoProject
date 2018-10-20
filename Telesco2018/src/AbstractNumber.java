class printer{
	
	public void print(Number i)
	{
		System.out.println(i);
	}
	
}
public class AbstractNumber {

	public static void main(String[] args) {
		
		printer obj=new printer();
		
		obj.print(5.5);
		
	}

}
