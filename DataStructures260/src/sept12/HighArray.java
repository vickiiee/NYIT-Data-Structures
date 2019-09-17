package sept12;
//Vickie Wu
//9/12/19

public class HighArray {
	private long[] a;
	private int nElems; // number of data items
	private int foundIndex;
	private int maxSize;

	public HighArray(int max) {
		if (max <= 0) {
			throw new IllegalArgumentException("size must be > 0");
		}

		a = new long[max]; // create the array
		maxSize = max;
		nElems = 0; // no items yet
		foundIndex = 0;
	}

	public void insert(long value) { // put element into array
		if (nElems == maxSize) {
			System.out.println("Array is full. Cannot add " + value);
		} else {
			a[nElems] = value; // insert it
			nElems++; // # of elements increased
		}
	}

	// ---------------2.0-----------------------------------
	public boolean find(long searchKey) { // find specified value
		int j;
		for (j = 0; j < nElems; j++) { // for each element,
			if (a[j] == searchKey) { // found item?
				foundIndex = j;
				return true;
			}
		}
		return false;
	}

	public boolean delete(long value) {
		boolean found = find(value);

		if (found == true) {

			System.out.println("--Deleting " + value);

			for (int i = foundIndex; i < nElems - 1; i++) { // 43,1,2,3,4,0,0,0 = 5 elements, 8 cells
				a[i] = a[i + 1];
			}

			a[nElems - 1] = 0;
			nElems = nElems - 1;
			return true;
		} else {
			System.out.println("--"+value + " not found.");
		}

		return false;
	}

	// ----------2.1-----------------------------------
	public long getMax() {
		long max = -1;
		
		for (int i = 0; i < nElems; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	// ---------2.2------------------
	public long removeMax() {
		long max = getMax();
		//System.out.println("Max:" + max); //testing
		delete(max);
		//display();
		return max;

	}

	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
}