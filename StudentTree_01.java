import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//1. Write a java program to store 5 student information in a treeMapNote: 
//student object has student name and student reg no

public class StudentTree_01 {

	public static void main(String[] args) {
		
		Map<String, String> student = new TreeMap<>();
		student.put("Tom", "RN04");
		student.put("Den","RN02");
		student.put("Avery", "RN03");
		student.put("Ben", "RN01");
		student.put("Yach", "RN05");		
		
		for(Map.Entry<String, String> st : student.entrySet())
			System.out.println("Student Name :"+st.getKey()+ "   Reg_No: "+ st.getValue());
	}

}
