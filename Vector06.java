import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/*
 * 6. Write a program to insert "tekarch" into vector
 *  then insert user inputed number(N) of Z's from 3rd position
 *  delete N charactors from 6th position from vector
 *  Example:if user input =5Then vector stores="tekZZZZZarch"
 *  Delete 5 character from 6th position so final string="tekZZZh"

 */
public class Vector06 {

	public static void main(String[] args) {
		
		Vector<String> vect = new Vector<>();			
		vect.add("tekarch");
		System.out.println("Intial String : "+vect);
		
		StringBuilder sb = new StringBuilder(vect.toString());		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many number of 'Z's needs to insert from 3rd index : ");
		int n =  scan.nextInt();
		
		for(int i=0;i<n;i++) 
			sb.insert(4,'Z'); 
		
		System.out.println("After adding (" +n+") 'Z' from 3rd position : "+ sb);
		

		System.out.println("how many number of characters to remove from 6th index : ");
		n =  scan.nextInt();
		
		for(int i =0;i<n;i++)
			sb.deleteCharAt(6);
		
		System.out.println("After removing " +n + " characters from 6th index : "+sb);	

	}
	

	
}
