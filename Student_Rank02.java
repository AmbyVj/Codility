import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 2. Write a java program to store 5 student information and 
 * award the students with 1st rank, 2nd rank and 3rd rank according to marks obtained
 * where each student has student name, student marks and student reg no information

 */
public class Student_Rank02  {
	
	String rno, name;
	int marks;
	
	Student_Rank02(){
		
	}
	Student_Rank02(String rno, String name, int marks){
		this.rno = rno;
		this.name = name;
		this.marks = marks;
		
		
	}
	
	public static Comparator<Student_Rank02> stuMarks = new Comparator<>() {
		public int compare(Student_Rank02 s1, Student_Rank02 s2) {
		   int score1 = s1.marks;
		   int score2 = s2.marks;		  
//		   return score1-score2;  //For ascending order		   
		   return score2-score1;  //For descending order
	   }};
	   

	public static void main(String[] args) {
		
		ArrayList<Student_Rank02> stuList = new ArrayList<>();
		
		stuList.add(new Student_Rank02("RN05", "Avery",880));
		stuList.add(new Student_Rank02("RN02", "Amy",990));
		
		Student_Rank02 student3 = new Student_Rank02("RN04", "Joe",885);
		Student_Rank02 student4 = new Student_Rank02("RN03", "Jim",998);
		Student_Rank02 student5 = new Student_Rank02("RN01", "Ben",870);
		
		
		stuList.add(student3);
		stuList.add(student4);
		stuList.add(student5);
		System.out.println("Students  Information after Ranking :");
		for(Student_Rank02 st: stuList) 
			System.out.println("RNo=" + st.rno + ", Name=" + st.name + ", Marks=" + st.marks);		
		
		
		Collections.sort(stuList, Student_Rank02.stuMarks);
		int i= 1;
		System.out.println("\nStudents  Information before Ranking :");
		for(Student_Rank02 st: stuList) 
			System.out.println("Rank : "+ i++ +" [ Reg. No=" + st.rno + ", Name=" + st.name + ", Marks=" + st.marks + "]");		
		
	}

}