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
	 * 		comparing and SWAPPING ADJACENT ELEMENTS if 
	 * 		the second element is less than the first element : O(N^2)
	 * 		>Nested for loops
	 * 		>Ultimately the biggest will be on the far right
	 * 		EX: STEps 
				 List: 77 99 44 55
				  *1st pass
				  77 99 44 55
				  77 44 99 55
				  77 44 55 99
				  
				  *2nd pass
				  44 77 55 99
				  44 55 77 99
				  -end-
	 * • Selection Sort (same) 
	 * • Insertion Sort (same)
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
