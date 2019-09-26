package sept24;

//Vickie Wu
//9/24/19

public class ArrayIns {
	private long[] a; // ref to array a
	private int nElems; // number of data items

	public ArrayIns(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}

	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

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

	// -----3.2------------
	public double median() {
		insertionSort(); // make sure the arr is sorted
		int medIndex;

		if (nElems % 2 == 0) { // even number of elements
			medIndex = (nElems / 2);
			return ((double) a[medIndex] + (double) a[medIndex - 1]) / 2;
		} else { // odd number of elements
			medIndex = (nElems / 2);
			return a[medIndex];
		}
	}

	// -----3.3------------
	public void noDups() { // CURRENT array must contain no duplicates
		insertionSort();// make sure the arr is sorted

		// O(N): linear notation - no nested for loops to find duplicates so skip indexes:
		int uniqueNums = 0;

		// find out how many unique elements there are
		for (int i = 0; i < nElems - 1; i++) { // nElems - 1 to avoid outOfBounds error

			// if the next element is not a duplicate
			if (a[i] != a[i + 1]) {
				// System.out.println("a[i]: " + a[i]);

				a[uniqueNums] = a[i]; // add the CURRENT element into the correct position in current arr
				uniqueNums++; // update num of unique elements
			}
		}

		// check last element, which for loop doesnt reach
		if (a[nElems - 1] != a[uniqueNums - 1]) {
			a[uniqueNums] = a[nElems - 1];
			uniqueNums++;
		}

		nElems = uniqueNums; // update new size
		// System.out.println("Unique Nums: " + uniqueNums);
	}
}
