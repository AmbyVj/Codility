/*
 * 10. Write a java program to implement your own stack data structure to store any number of items.
 *  And implement the following operations 1.push 2. pop 3. peek 4.display stack content

 */
public class Stack_Operations_10 {
		static int limit = 100;
	    static int top;
	    int a[] = new int[limit]; 
	 
	    static boolean isEmpty() {
	        return (top < 0);
	    }
	    
	    Stack_Operations_10() {
	        top = -1;
	    }
	 
	    boolean push(int x)
	    {
	        if (top >= (limit - 1)) {
	            System.out.println("Stack Full [Overflow]");
	            return false;
	        }
	        else {
	            a[++top] = x;
	            System.out.println("Push :" +x);
	            return true;
	        }
	    }
	 
	    int pop()
	    {
	        if (top < 0) {
	            System.out.println("Stack Empty[Underflow]");
	            return 0;
	        }
	        else {
	            int x = a[top--];
	            return x;
	        }
	    }
	 
	    
	    int peek()
	    {
	        if (top < 0) {
	            System.out.println("Stack Underflow");
	            return 0;
	        }
	        else {
	            int x = a[top];
	            return x;
	        }
	    }
	
	 
	
	
	    public static void main(String args[])
	    {
	    	Stack_Operations_10 s = new Stack_Operations_10();
	    	System.out.println("Is stack Empty? : "+isEmpty());
	    	System.out.print("Peek(Top) from Empty Stack : ");
	    	s.peek();
	    	System.out.println("\nPushing elements into Stack :");
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s.push(40);
	        System.out.println("Peek(Top) from Stack : "+s.peek());
	        System.out.println("Again Peek(Top) from Stack : "+s.peek());
	        System.out.println("Pop from stack : " +s.pop());
	        System.out.println("After Pop,now Peek(Top) from Stack : "+s.peek());
	        System.out.println("Now Pop from stack : " +s.pop());
	    }

	

}
