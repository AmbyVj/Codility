import java.util.ArrayList;
import java.util.Iterator;

//7. Write a java program to implement your own ArrayList which has two methods
//a) add b) remove and store 5 student information in your ArrayList.

public class StudentArrayList07 {

	public static void main(String[] args) {
		
		ArrayList<String> student = new ArrayList<>();
		student.add("student A");
		student.add("student B");
		student.add("student C");
		student.add("student D");
		student.add("student E");
		
		System.out.println("Students in ArrayList :" +student);
		Iterator<String> itr = student.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Removing :"+itr.next());
			itr.remove();
		}
		

	}

}
