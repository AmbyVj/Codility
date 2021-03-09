/*
 * A Java multithreaded program may suffer from the deadlock condition 
 * because the synchronized keyword causes the executing thread to block while waiting for the lock, 
 * or monitor, associated with the specified object
 */
public class DeadLockProgram18 {
	static Object Lock1 = new Object();
    static Object Lock2 = new Object();

	public static void main(String[] args) {
		
		  ThreadName1 thread1 = new ThreadName1();
	      ThreadName2 thread2 = new ThreadName2();
	      thread1.start();
	      thread2.start();
	}
	    
	   
	    private static class ThreadName1 extends Thread {
	      public void run() {
	         synchronized (Lock1) {
	            System.out.println("Thread 1: Has  Lock1");
	            try {
	                Thread.sleep(10);
	            }
	            catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println("Thread 1: Waiting for Lock 2");
	            
	            synchronized (Lock2) {
	               System.out.println("Thread 1: No DeadLock");
	            }
	         }
	      }
	   }
	   private static class ThreadName2 extends Thread {
	      public void run() {
	         synchronized (Lock2) {
	            System.out.println("Thread 2: Has  Lock2");
	            
	            try { 
	                Thread.sleep(10);
	            }
	            catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println("Thread 2: Waiting for Lock 1");
	           
	            synchronized (Lock1) {
	               System.out.println("Thread 2: No DeadLock");
	            }
	         }
	      }
	   }
	   
	   

}
