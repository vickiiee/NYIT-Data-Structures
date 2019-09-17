package sept12;
//Vickie Wu

//9/12/19

//highArray.java
//demonstrates array class with high-level interface
//to run this program: C>java HighArrayApp

public class HighArray {
	private long[] a; // ref to array a
	private int nElems; // number of data items

	private int foundIndex;
	
	private int maxSize;
//-----------------------------------------------------------

	public HighArray(int max) { // constructor
		if (max <= 0) {
			throw new IllegalArgumentException("size must be > 0");
		}
		
		a = new long[max]; // create the array
		maxSize = max;
		
		/**
		 * for(int i = 0; i < a.length; i++) { System.out.println(a[i]); }
		 **/
		nElems = 0; // no items yet

		foundIndex = 0;
	}

//-----------------------------------------------------------
	public boolean find(long searchKey) { // find specified value
		int j;
		for (j = 0; j < nElems; j++) { // for each element,
			if (a[j] == searchKey) { // found item?
				// break; // exit loop before end
				foundIndex = j;
				return true;
			}
		}
		/**
		 * if (j == nElems) // gone to end? return false; // yes, can't find it else
		 * return true; // no, found it
		 **/

		return false;
	} // end find()
//-----------------------------------------------------------

	public void insert(long value){ // put element into array
		if(nElems ==maxSize) {
			System.out.println("Array is full. Cannot add "+ value);
		} else {
			a[nElems] = value; // insert it
			nElems++; // increment size
		}
	}

//-----------------------------------------------------------
	public boolean delete(long value) {
		/**
		 * int j; for (j = 0; j < nElems; j++) // look for it 
		 * 	if (value == a[j]) 
		 * 	break;
		 * if (j == nElems) // can't find it return false; else // found it { for (int k
		 * = j; k < nElems; k++) // move higher ones down a[k] = a[k + 1]; nElems--; //
		 * decrement size return true; }
		 **/

		boolean found = find(value);
		if (found == true) {
			System.out.println("Deleting "+value);
			// remove it
//			a[foundIndex] = 0;
			for (int i = foundIndex; i < nElems-1; i++) { // 43,1,2,3,4,0,0,0 = 5 elements, 8 cells
				a[i] = a[i + 1];
			}
			
			a[nElems-1] = 0;
			nElems = nElems - 1;
			
			/**for (int i = 0; i < a.length; i++) { // 43,1,2,3,4,0,0,0 = 5 elements, 8 cells
				System.out.println(i+": "+a[i]);
			}**/ //testing
		} else {
			System.out.println(value+" not found.");
			return false;
		}
		return false;
	} // end delete()

	public long getMax() {
		if(nElems == 0) {
			return -1;
		}
		
		long max = -1;
		for (int i = 0; i < nElems; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public void removeMax() {

	}
//-----------------------------------------------------------

	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

//-----------------------------------------------------------
}