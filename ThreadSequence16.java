//Write a java program to create three threads T1, T2 and T3 and ensure sequence T1,T2,T3 in java.
//start the thread and call the join() method on the same thread. This makes it to wait until the thread stops executing.

public class ThreadSequence16 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		
		
		Thread t1 = new Thread(new ThreadSequence16(), "t1");
		Thread t2 = new Thread(new ThreadSequence16(),"t2");
		Thread t3 = new Thread(new ThreadSequence16(),"t3");
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();	
		t3.join();

	}

	
	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName()+ " is started now");
		for(int i=1; i<=3; i++) 
			System.out.println("Thread "+Thread.currentThread().getName()+ " : "+i);
		System.out.println("Thread "+Thread.currentThread().getName()+ " is ended;");
		
	}

}
