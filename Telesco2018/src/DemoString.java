
public class DemoString {

	public static void main(String[] args) {
		
	/*	String str= "navin ,sambhaji ,rahul ,vijay";
		
	String names[]=str.split(",");
	
	for(String val:names)
		
		System.out.println(val);
		*/
		
		StringBuffer sbf= new StringBuffer("nabin");
		
		sbf.append(" reddy");
		
		
		
		sbf.replace(0, 5, "manoj");

		sbf.reverse();
		sbf.delete(0, 2);
		
		System.out.println(sbf);
		System.out.println(sbf.capacity());
		
		
		
		

	}

}
