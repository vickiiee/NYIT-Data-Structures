package sept17;

//demonstrates ordered array class
public class OrdArray {
	private long[] a; // ref to array a
	private int nElems; // number of data items
	
	private int max;

	public OrdArray(int max) // constructor
	{
		this.max = max;
		a = new long[max]; // create array
		nElems = 0;
	}

	public int size() {
		return nElems;
	}

	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;

		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == searchKey)
				return curIn; // found it
			else if (lowerBound > upperBound)
				return nElems; // can't find it
			else // divide range
			{
				if (a[curIn] < searchKey)
					lowerBound = curIn + 1; // it's in upper half
				else
					upperBound = curIn - 1; // it's in lower half
			} // end else divide range
		} // end while
	}
	
	public void insert(long value) // put element into array in correct spot
	{
		System.out.println("\nInserting vlaue: " + value);

		if (nElems == max) {
			System.out.println("Array is full. Cannot add " + value);
		} else
		// binary Search
		if (nElems == 0) { // no values in array
			a[0] = value;
			nElems++;
			display();
			System.out.println("nELems: " + nElems);

			// break

		} else { // at least one value in the array
			int lowerBound = 0;
			int upperBound = nElems - 1;
			int curIn;

			while (true) {
				curIn = (lowerBound + upperBound) / 2;
				// System.out.println("lowerBound: "+ lowerBound + " |upperBound: "+ upperBound+
				// " |curIn: "+ curIn);
				if (a[curIn] == value) {
					nElems = nElems + 1;
					for (int i = nElems; i > curIn; i--) {
						a[i] = a[i - 1];
					}
					a[curIn + 1] = value;
					System.out.println("nELems: " + nElems);
					break;
				} else if (lowerBound > upperBound) {
					// insert the element
					nElems = nElems + 1;
					for (int i = nElems - 1; i > lowerBound; i--) {
						a[i] = a[i - 1];
					}
					a[lowerBound] = value;
					System.out.println("nELems: " + nElems);
					break;
				} else // divide range
				{
					if (a[curIn] < value)
						lowerBound = curIn + 1; // it's in upper half
					else
						upperBound = curIn - 1; // it's in lower half
				} // end else divide range
			} // end while

		}
	} // end insert()
	
	
	public boolean delete(long value) {
		int j = find(value);
		if (j == nElems) // can't find it
			return false;
		else // found it
		{
			for (int k = j; k < nElems; k++) // move bigger ones down
				a[k] = a[k + 1];
			nElems--; // decrement size
			return true;
		}
	} // end delete()

	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
//-----------------------------------------------------------
} 