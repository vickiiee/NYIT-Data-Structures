package sept24;

import java.util.Arrays;

//Vickie Wu
//9/24/19


//insertSort.java
//demonstrates insertion sort
//to run this program: C>java InsertSortApp
//--------------------------------------------------------------
class ArrayIns {
	private long[] a; // ref to array a
	private int nElems; // number of data items
//--------------------------------------------------------------

	public ArrayIns(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}

//--------------------------------------------------------------
	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

//--------------------------------------------------------------
	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

//--------------------------------------------------------------
	public void insertionSort() {
		int in, out;

		for (out = 1; out < nElems; out++) // out is dividing line
		{
			long temp = a[out]; // remove marked item
			in = out; // start shifts at out
			while (in > 0 && a[in - 1] >= temp) // until one is smaller,
			{
				a[in] = a[in - 1]; // shift item to right
				--in; // go left one position
			}
			a[in] = temp; // insert marked item
		} // end for
	} // end insertionSort()
//--------------------------------------------------------------
	
	public double median() {
		insertionSort(); //make sure the arr is already sorted
		int medIndex;
		
		if(nElems%2 == 0) { //even number of elements
			medIndex = (nElems/2);
			return ((double) a[medIndex]+ (double) a[medIndex-1])/2;
		}else { //odd number of elements
			medIndex = (nElems/2);
			return a[medIndex];
		} 
	}
	
	public void noDups() {
		insertionSort();//make sure the arr is already sorted
		
		//linear notation: skip indexes
		
		int uniqueNums = 0;
		
		//String arr = Arrays.toString(a);
		
		//find out how many unique elements there are
		for(int i = 0; i < nElems; i++) {
			long input = a[i];
			
			if(input != a[i+1] ) {
				uniqueNums++;
			}
		}
		
		System.out.println("Unique Nums: " +uniqueNums);
		
		//make array with the uniqueNUms as length:
		
		long[] noDupArr = new long [uniqueNums];
		int index  = 0;
		for(int i = 0; i< nElems; i++) {
			long input = a[i];
			
			if(input != a[i+1] ) {
				System.out.println("a[i]: "+ a[i]);
				//noDupArr[index] = a[i];
				a[index] = a[i];
				index++;
			}
		}
		nElems = uniqueNums;
		//a = noDupArr;
		System.out.println(Arrays.toString(noDupArr)); //dont need no dup arr
	}
}
