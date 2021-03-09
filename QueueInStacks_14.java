import java.util.*;

//14. Implement your own QUEUE using STACKS data structure

public class QueueInStacks_14 {
	
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();

	public static void main(String[] args) {
		
		QueueInStacks_14 que = new QueueInStacks_14();
		que.enQueue(2);
		que.enQueue(4);
		que.enQueue(6);
		que.enQueue(8);
		
		
		System.out.println("Removing an element from Queue :" +que.deQueue());
		System.out.println("Removing an element from Queue :" +que.deQueue());
		System.out.println("Removing an element from Queue :" +que.deQueue());
		System.out.println("Removing an element from Queue :" +que.deQueue());		
		
	}
	
	public void enQueue(int n ) {
		
		System.out.println("Inserting an element "+n+" into Queue");
		stack1.push(n);
		
	}
		
//		if(!stack1.isEmpty()) {
//			stack2.push(stack1.pop());
//		}
//		stack1.push(n);
//		if(!stack2.isEmpty()) {
//			stack1.push(stack2.pop());
//		}
		
		
	 public Integer deQueue() {
		while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		return stack2.pop();
		 }

}
