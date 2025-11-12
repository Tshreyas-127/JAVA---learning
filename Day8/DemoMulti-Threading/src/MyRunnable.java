
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		System.out.println("In run"+ Thread.currentThread().getName());
		
		
	}
	
	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);

		Thread t1 = new Thread (()->{System.out.println("In run"+ Thread.currentThread().getName());});
		
		t.start();
		t1.start();

	}

}
