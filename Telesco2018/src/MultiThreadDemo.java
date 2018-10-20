
public class MultiThreadDemo {

	public static void main(String[] args) {
		
		Thread t1=new Thread(() -> {
			
			for(int i=1;i<=5;i++) {
				System.out.println("hi");
				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
				
			}
		}
				);
		
Thread t2=new Thread(() -> {
			
			for(int i=1;i<=5;i++) {
				System.out.println("hello");
				try {
					Thread.sleep(1000);
				}catch(Exception e) {}
				
			}
		}
				);
t1.setName("hii thread");
t2.setName("hello thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {
			Thread.sleep(10);
		}catch(Exception e) {}
		
		t2.start();
		
		System.out.println(t1.isAlive());
		
		try {
			t1.join();
		}catch(Exception e) {}
		try {
		t2.join();}catch(Exception e) {}
		;
		
		System.out.println("bye");
	}

}
