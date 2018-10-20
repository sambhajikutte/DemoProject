class a{
	final int i;
	
	public a()
	{
		i=10;
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		
		a obj=new a();
		
		int p= obj.i;
		
		System.out.println(p);
	}

}
