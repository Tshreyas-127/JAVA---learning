
public class MyThread  extends Thread{

	@Override
	public void run() {
		Thread c =Thread.currentThread();
		for(int i=0;i<=5;i++)
			System.out.println("In run"+ c.getName());
		
		System.out.println(c.getPriority());
		
}
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setName(" Hello");
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		
		
		MyThread t1 = new MyThread();
		t1.setName(" Hello");
//		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		System.out.println(Thread.currentThread().getName());

	}

}
