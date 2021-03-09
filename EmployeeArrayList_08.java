import java.util.ArrayList;

//8.Store user defined employee objects into arraylist and Remove duplicates from arraylist without using collections.

public class EmployeeArrayList_08 {
	 int empNum; 
	 String empName, empAddr; 

	 EmployeeArrayList_08(int num, String name, String addr)
	 { 
	   this.empNum = num; 
	   this.empName = name; 
	   this.empAddr = addr; 
	 } 
	
	 public static void displayData(ArrayList<EmployeeArrayList_08> list) {		 
		  for(EmployeeArrayList_08 emp: list)	     
	        System.out.println("Employee number: " +emp.empNum + " Name: " +emp.empName+ " Address: " +emp.empAddr);     
		 }
	


	public static void main(String[] args) {
	
		EmployeeArrayList_08 emp1 =new EmployeeArrayList_08(101, "Tiny", "SD");
		EmployeeArrayList_08 emp2 =new EmployeeArrayList_08(102, "Tony", "SFO");
		EmployeeArrayList_08 emp5 =new EmployeeArrayList_08(101, "Tiny", "SD");
		EmployeeArrayList_08 emp3 =new EmployeeArrayList_08(103, "Timmy", "SJ");
		EmployeeArrayList_08 emp4 =new EmployeeArrayList_08(104, "Terry", "OR");
		EmployeeArrayList_08 emp6 =new EmployeeArrayList_08(104, "Terry", "OR");
		
		
		ArrayList<EmployeeArrayList_08> arrList = new ArrayList<>();
		
		arrList.add(emp1);
		arrList.add(emp2);
		arrList.add(emp3);
		arrList.add(emp4);
		arrList.add(emp5);
		arrList.add(emp6);
		
		System.out.println("After adding employee details : ");
		displayData(arrList);
		
		 
		for(int i=0;i<arrList.size();i++) {		 
		 for(int j=i+1;j<arrList.size();j++){
		            if(arrList.get(i).empNum == (arrList.get(j).empNum)){
		            	arrList.remove(j);
		                j--;
		            }
		      }
		 }
		
		System.out.println("\n\nAfter Removing  duplicates in employee details : ");
		displayData(arrList);
	}

}


