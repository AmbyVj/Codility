import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



//4. Write a java program to store 5 unique elements in sorted order.
//Error should exist if user tries to add duplicates.

public class Unique_04 {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		set.add(9);
		set.add(3);
		set.add(5);
		set.add(2);
		set.add(1);
		System.out.println("Elements in Set : " +set);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the unique integer : ");
		int n = scan.nextInt();
		
		if(set.add(n) == false)
			System.out.println("Error : The given integer exists already.");
		System.out.println("\nElements are : " +set);		
		
	}

}
