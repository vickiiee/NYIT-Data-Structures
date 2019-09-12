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
//-----------------------------------------------------------

	public HighArray(int max) // constructor
	{
		a = new long[max]; // create the array
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

	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

//-----------------------------------------------------------
	public boolean delete(long value) {
		/**
		 * int j; for (j = 0; j < nElems; j++) // look for it if (value == a[j]) break;
		 * if (j == nElems) // can't find it return false; else // found it { for (int k
		 * = j; k < nElems; k++) // move higher ones down a[k] = a[k + 1]; nElems--; //
		 * decrement size return true; }
		 **/

		boolean found = find(value);
		if (found == true) {
			// remove it
			a[foundIndex] = 0;
			for (int i = foundIndex; i < nElems; i++) { // 43,1,2,3,4,0,0,0 = 5 elements, 8 cells
				a[i] = a[i + 1];
			}
			a[nElems] = 0;
			nElems = nElems - 1;
		} else {
			return false;
		}
		return false;
	} // end delete()

	public long getMax() {
		long max = -1;
		for(int i = 0; i < nElems; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
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