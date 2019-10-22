package oct17midtermReview;

public class Notes {
	/*
	 * check out review pdf 
	 * 
	 * Ch2 Arrays 
	 * • The Basics of Arrays in Java (search, insert, delete) 
	 * 		>Search: using a for loop
	 * 		>Insert: using a for loop and shifting values up
	 * 		>Delete: using a for loop and shifting values down
	 * • Java Code for an Ordered Array (searching: linear, binary) (noDups()) 
	 * 		>Linear Search: for loop and search through the entire array
	 * 
	 * 			for(int i = 0; i < n; i++){
	 * 				if(a[i]== key) return a[i]; or print "found"
	 * 			}
	 * 
	 * 		>Binary Search: while/recursion to search through halves of the array
	 * 
	 * 			low = 0;
	 * 			high = a.length-1;
	 * 			while(high>=low){
	 * 				mid = (low + high)/2;
	 * 				if(a[mid]==key){
	 * 					print found!!
	 * 					return mid;
	 * 				}else if (a[mid] > key){
	 * 					high = mid - 1;
	 * 				}else {
	 * 					low = mid + 1;
	 * 				}
	 * 			}
	 * 			return -1;
	 * 
	 * 		>Check out noDups()
	 * 
	 * • Logarithms (how many steps are required to binary search and array of 1000 (N) elements?) 
	 * 		>ZYBOOKS 2.2
	 * 		>Binary Search: [log2 (N) + 1] = number of STEPS required if cannot find the search element. 
	 * 						[log2 (N)] = number of ELEMENTS CHECKED if cannot find the search element
	 * 		>Linear Search: N times if cannot find the search element
	 * • Big O Notation (Running Time in Big O Notation)
	 * 		>Check out WS/Zybooks 2.5
	 * 		>O(1): Constant
	 * 		>O(logN): Logarithmic
	 * 			*Binary Search
	 * 		>O(N): Linear
	 * 			*Linear Search
	 * 		>O(NlogN): Linearithmic
	 * 			*Merge Sort
	 * 		>O(N^2): Quadratic
	 * 			*Selection Sort
	 * 		>O(C^N): Exponential
	 * 			*Fibonacchi
	 * Ch3 Simple sorting 
	 * • Bubble Sort (77 99 44 55 show the steps) 
	 * 		>Zybooks 3.2
	 * 		>a sorting algorithm that iterates through a list, 
	 * 		 comparing and SWAPPING ADJACENT ELEMENTS if 
	 * 		 the second element is less than the first element : O(N^2)
	 * 		>Nested for loops
	 * 		>Ultimately the biggest will be on the far right
	 * 		>i in for loop never reaches end of array which is sorted
	 * 		>biggest number will always be on the right
	 * 		>each pass swaps x times
	 * 		EX: STEps 
	 * 			Practice:https://facweb.northseattle.edu/voffenba/class/CSC110-Resources/BubbleSortPractice.htm
				 List: 77 99 44 55
				  *1st pass
				  77 99 44 55
				  77 44 99 55
				  77 44 55 99
				  
				  *2nd pass
				  44 77 55 |99
				  44 55 77 |99
				  *3rd pass
				  44 55 |77 99
				  -end-
				  Everything: https://www.geeksforgeeks.org/bubble-sort/
				  Another visual: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/visualize/
				  				https://visualgo.net/en/sorting
	 * • Selection Sort (same) 
	 * 		>Zybooks 3.3
	 * 		>The term "selection" comes from the fact that for each iteration of the outer loop, a value is selected for position i.
	 * 		>The index variable i denotes the dividing point. Elements to the left of i are sorted, 
	 * 		 and elements including and to the right of i are unsorted.
	 * 		>go down rest of unsorted part of array, 'select' lowest element, then swap indexes
	 * 		>Nested for loops O(N^2)
	 * 		>Swaps 1X during each pass of outer loop
	 * 		EX: STEps 
	 * 		Practice: https://facweb.northseattle.edu/voffenba/class/CSC110-Resources/SelectionSortPractice.htm
				 List: 77 99 44 55
				 *1st pass
				 44 99 77 55
				 *2nd pass
				 44| 55 77 99
				 *3rd
				 44 55| 77 99
				 *4th
				 44 55 77 |99
	 * 		
	 * • Insertion Sort (same)
	 * 		>Zybooks 3.4
	 * 		>The index variable i denotes the starting position of the current element in the unsorted part. 
	 * 		 Initially, the first element (i.e., element at index 0) is assumed to be sorted, so the outer for loop initializes i to 1. 
	 * 		 The inner while loop inserts the current element into the sorted part by repeatedly swapping the current element with the 
	 * 		 elements in the sorted part that are larger. Once a smaller or equal element is found in the sorted part,
	 * 		 the current element has been inserted in the correct location and the while loop terminates.
	 * 		>O(N^2) for unsprted
	 * 		>O(N) for nearly sorted
	 * 		>At start, index 0 is considered sorted and the rest of arr is unsorted
	 * 		>Elements shift down to make space for element at correct position
	 * 			>At least one comparison for each pass
	 * 			> Shift elements down x times and only 1** swap per pass
	 * 		>only 1 for loop
	 * 		EX: STEps 
	 * 				https://facweb.northseattle.edu/voffenba/class/CSC110-Resources/InsertionSortPractice.htm
				 List: 77| 99 44 55
				 *1st
				 77 99| 44 55
				 *2nd
				 44 77 99| 55
				 *3rd
				 44 55 77 99|
				 *everything b4 | is srted part of arr
				 
	 * 
	 * Ch4 Stacks and Queues (with arrays) 
	 * • (12 3 4 * 5 * * 9 * 10) Numbers mean a push on a stack and * means a pop. What is the final stack? 
	 * • (12 3 4 * 5 * * 9 * 10) Numbers mean a add to a queue and * means remove. What is the final queue? 
	 * • Stacks (write a stack class with array/link list) 
	 * • Queues (write a queue class with array/link list) 
	 * • Priority Queues 
	 * • Given a partial class, write constructor, remove(), peek(), isEmpty(), isFull(), traverse() + other methods.
	 * 
	 * Ch 5 Linked Lists 
	 * • Links 
	 * • A Simple Linked List 
	 * • Finding and Deleting Specified Links 
	 * • Double-Ended List 
	 * • Doubly-Linked List 
	 * • Given a partial class, write constructor, insertFirst(), deleteFirst(),, insertLast(), deleteLast(), find() , displayList() , traverse() + other methods.
	 * 
	 * Ch6 Recursion
	 */
	
	public static void main(String args[]) {
		//Big O Notation:
		
		//Ex 6:
		int sum = 0;
		int n = 10;
		for(int i = 0; i < n; i++) {
			System.out.println(i);
			for(int j =1; j < n; j*=2) {
				System.out.println("	"+j);
				sum++;
				System.out.println("		"+sum);
			}
		}
	}
}
