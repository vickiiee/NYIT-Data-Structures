package sept24;

//Vickie Wu
//9/24/19

public class InsertSortApp {
	public static void main(String[] args) {
		int maxSize = 100; // array size
		ArrayIns arr; // reference to array
		arr = new ArrayIns(maxSize); // create the array

		arr.insert(77); 
		arr.insert(99);
		arr.insert(44);
		arr.insert(88);
		arr.insert(88);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(33);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(5);
		arr.insert(99);
		arr.insert(100);
		
		System.out.println("Unsorted array: ");
		arr.display(); // display items

		arr.insertionSort(); // insertion-sort them
		System.out.println("\nSorted array: ");
		arr.display();
		
		System.out.println("Median is: " + arr.median());
		
		System.out.println("\nTook out duplicates:");
		arr.noDups();
		arr.display(); // display them again	
		System.out.println("Median is: " + arr.median());
	} // end main()
} // end class InsertSortApp
