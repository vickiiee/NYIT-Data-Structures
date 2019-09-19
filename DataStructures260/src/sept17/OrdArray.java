package sept17;

//Vickie Wu
//9/17/19

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

	//--------------2.4-----------------------
	public void insert(long value) // put element into array in correct spot
	{
		//System.out.println("\nInserting vlaue: " + value);

		// Array is at full capacity
		if (nElems == max) {
			System.out.println("Array is full. Cannot add " + value);
		} else if (nElems == 0) { // no values in array
			a[0] = value;
			nElems++;
			//display();
			//System.out.println("nELems: " + nElems);
		} else { // at least one value in the array
			// binary Search
			int lowerBound = 0;
			int upperBound = nElems - 1;
			int curIn;

			while (true) {
				curIn = (lowerBound + upperBound) / 2;
				// System.out.println("lowerBound: " + lowerBound + " |upperBound: " + upperBound + " |curIn: " + curIn);

				if (a[curIn] == value) { // if element is the same as value, just add value after the element
					for (int i = nElems; i > curIn; i--) { // shift elements up
						a[i] = a[i - 1];
					}

					nElems = nElems + 1; // increase elements size
					a[curIn + 1] = value;
					//System.out.println("nELems: " + nElems);
					break;
				} else if (lowerBound > upperBound) {
					// insert the element
					nElems = nElems + 1;
					for (int i = nElems - 1; i > lowerBound; i--) {
						a[i] = a[i - 1];
					}
					
					a[lowerBound] = value;
					//System.out.println("nELems: " + nElems);
					break;
				} else // divide range
				{
					if (a[curIn] < value)
						lowerBound = curIn + 1; // it's in upper half
					else
						upperBound = curIn - 1; // it's in lower half
				}
			}

		}
	}

	//--------------2.4-----------------------
	public boolean delete(long value) {
		// binary search
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;

		//int loop = 0;

		while (true) {
			// loop++;
			// System.out.println("loop: " + loop);

			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == value) {// delete it
				for (int i = curIn; i < nElems - 1; i++) { // shift elements down
					a[i] = a[i + 1];
				}
				
				nElems--; // decrement size
				return true;
			} else if (lowerBound > upperBound) { // can't find it
				System.out.println(value + " not found");
				return false;
			} else { // divide range
				if (a[curIn] < value)
					lowerBound = curIn + 1; // it's in upper half
				else
					upperBound = curIn - 1; // it's in lower half
			}
		}

	}

	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

	//---------------2.5---------------------------
	public OrdArray merge(OrdArray input) {
		// create class that has an arr thats size is the total of both arrs
		OrdArray merge = new OrdArray((input.size() + size()));
		
		// add all elements from one arr into new one
		for (int i = 0; i < nElems; i++) {	
			merge.insert(a[i]); // sorts out indexes
			//merge.display();
		}
		
		long[] inputArr = input.arr();
		
		// add all elements from the other arr into new one
		for (int i = 0; i < input.size(); i++) {
			merge.insert(inputArr[i]); // sorts out indexes
			//merge.display();
		}
		return merge;

	}

	public long[] arr() {
		return a;
	}
}