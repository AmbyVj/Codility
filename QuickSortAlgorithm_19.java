//19. What is stable algorithm? write an algorithm for quicksort. sort the fallowing using quicksort.
//is quick sort is stable algorithm. if not give reason. 50 70 10 40 50

public class QuickSortAlgorithm_19 {

	public static void main(String[] args) {
		/*
		 * Quick sort is not a stable algorithm because the swapping of elements is done according to pivot's position
		 * 																 (without considering their original positions). 
		 * A sorting algorithm is said to be stable if it maintains the relative order of records in the case of equality of keys.
		 * Quick sort is an inplace algorithm which means the numbers are all sorted within the original array itself.
		 */
		
		/* Quick sort Algorithm :
		 * 	Step 1 − Make any element as pivot
			Step 2 − Partition the array on the basis of pivot
			Step 3 − Apply quick sort on left partition recursively
			Step 4 − Apply quick sort on right partition recursively
			
			sorted array will be:  10 40 50 50 70 
		 */
		
		
		
	}			

}
