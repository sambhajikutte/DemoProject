import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set v=new TreeSet();
		v.add(15);
		v.add(120);
		v.add(35);
		v.add(25);
		v.add(25);
		System.out.println(v.size());
		
		/*v.forEach(i -> System.out.println(i));*/
		for(Object s:v) {
			System.out.println(s);
		}
		int n=0;
		if( n<=10) {
			n++;
			System.out.println(n);
		}
	}

}
