import java.util.Arrays;

//13. Explain circular queue with implemented program for addition and deletion.

public class Circular_Queue_13 {

	public static void main(String[] args) {
		CircularQueue<Integer> circularQueue = new CircularQueue(8);

	    circularQueue.enqueue(11);
	    circularQueue.enqueue(16);
	    circularQueue.enqueue(13);
	    circularQueue.enqueue(18);
	    circularQueue.enqueue(21);
	    circularQueue.enqueue(30);
	    circularQueue.enqueue(41);
	    circularQueue.enqueue(42);

	    System.out.println("Full Circular Queue" + circularQueue);

	    System.out.print("\nDequeued following element from circular Queue ");
	    System.out.println(circularQueue.dequeue() + " ");
	    circularQueue.enqueue(23);
	    System.out.println("\nAfter enqueueing circular queue with element having value 23");
	    System.out.println(circularQueue);
	   }

	}

	//implementation of Circular Queue 
	class CircularQueue<E> {

	private int currentSize; //Current Circular Queue Size
	private E[] circularQueueElements;
	private int maxSize; //Circular Queue maximum size

	private int rear;//rear position of Circular queue(new element enqueued at rear).
	private int front; //front position of Circular queue(element will be dequeued from front).      

	public CircularQueue(int maxSize) {
	    this.maxSize = maxSize;
	    circularQueueElements = (E[]) new Object[this.maxSize];
	    currentSize = 0;
	    front = -1;
	    rear = -1;
	}


	 // Enqueue elements to rear.

	public void enqueue(E item)  {
	    if (currentSize == circularQueueElements.length) {
	        System.out.println("Circular Queue is full. Element cannot be added");
	    }
	    else {
	        rear = (rear + 1) % circularQueueElements.length;
	        circularQueueElements[rear] = item;
	        currentSize++;
	        
	        if (front == -1) {
				front = rear;
			}
	    }
	}


	// Dequeue element from Front.

	public E dequeue()  {
	    E deQueuedElement = null;
	    if (currentSize == 0) {
	        System.out.println("Circular Queue is empty. Element cannot be retrieved");
	    }
	    else {
	        deQueuedElement = circularQueueElements[front];
	        circularQueueElements[front] = null;
	        front = (front + 1) % circularQueueElements.length;
	        currentSize--;
	    }
	    return deQueuedElement;
	}

	@Override
	public String toString() {
	    return "CircularQueue [" + Arrays.toString(circularQueueElements) + "]";
	}

	}

