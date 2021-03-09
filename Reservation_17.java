/*
 * 17. Implement ticket reservation application using multithreading
 *  where it has available seats information. 
 *  Create 4 threads to access this data to book tickets and ensure data consistency
 *  Ex available seats=10 T1 requires 6 seats T2 requires 3 seats T2 requires 4 seats If available seats < seats required proper error message should get printed

 */
public class Reservation_17 {
	
	    public static void main(String[] args)
	    {
	        Reservation reserve = new Reservation(); 
	        Seats thread1 = new Seats(reserve, 6); 
	        thread1.start();
	        Seats thread2 = new Seats(reserve, 3);
	        thread2.start();
	        Seats thread3 = new Seats(reserve, 4);
	        thread3.start();
	    }
	}

	class Reservation	{

	    static int availableSeats = 10;
	    synchronized void reserveSeat(int requestedSeats)   {
	        System.out.println("\n"+Thread.currentThread().getName() + " entered.");
	        System.out.println("Availableseats : " + availableSeats + " Requestedseats : " + requestedSeats);
	        if (availableSeats >= requestedSeats)   {
	            System.out.println("Requested Seats are Available");
	            try  	            {
	                Thread.sleep(10);     
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted");
	            }
	            System.out.println(requestedSeats + " seats reserved.");
	            availableSeats = availableSeats - requestedSeats;
	        }
	        else  {
	            System.out.println("Requested seats  are not available");
	        }
	        System.out.println(Thread.currentThread().getName() + " leaving.");	        
	    }
	}

	class Seats extends Thread {

	    Reservation reserve;
	    int requestedSeats;

	    public Seats(Reservation reserve, int requestedSeats)   {
	        this.reserve = reserve;
	        this.requestedSeats = requestedSeats;
	    }

	    @Override
	    public void run()  {
	        reserve.reserveSeat(requestedSeats);
	    }

}
