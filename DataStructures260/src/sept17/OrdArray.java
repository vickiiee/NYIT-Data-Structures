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

		//Array is at full capacity
		if (nElems == max) { 
			System.out.println("Array is full. Cannot add " + value);
		} else if (nElems == 0) { // no values in array
			a[0] = value;
			nElems++;
			display();
			System.out.println("nELems: " + nElems);
		} else { 													// at least one value in the array
			// binary Search
			int lowerBound = 0;
			int upperBound = nElems - 1;
			int curIn;

			while (true) {
				curIn = (lowerBound + upperBound) / 2;
				System.out.println("lowerBound: "+ lowerBound + " |upperBound: "+ upperBound+ " |curIn: "+ curIn);
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
		/**int j = find(value);
		if (j == nElems) // can't find it
			return false;
		else // found it
		{
			for (int k = j; k < nElems; k++) // move bigger ones down
				a[k] = a[k + 1];
			nElems--; // decrement size
			return true;
		}**/
		
		
		//binary search
		int lowerBound = 0;
		int upperBound = nElems - 1;
		int curIn;

		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn] == value) {
				//delete it
				for (int i = curIn; i < nElems; i++) // move bigger ones down
					a[i] = a[i + 1];
				nElems--; // decrement size
				return true;
				//check if last element needs to bechanged
			} else if (lowerBound > upperBound) {// can't find it
				System.out.println(value + " not found");
			return false;
			}else // divide range
			{
				if (a[curIn] < value)
					lowerBound = curIn + 1; // it's in upper half
				else
					upperBound = curIn - 1; // it's in lower half
			} // end else divide range
		} // end while
		
		
		
	} // end delete()

	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
//-----------------------------------------------------------

	public OrdArray merge(OrdArray input) {
		//long[] merge = new long[(input.size()+size())];
		OrdArray merge = new OrdArray((input.size()+size()));
		/**for(int i = 0; i < nElems; i++) {
			merge.insert(a[i]);
		}
		long[] inputArr = input.arr();
		for(int i = 0; i < input.size(); i++) {
			merge.insert(inputArr[i]);
		}
		return merge;**/
		
		int og = size();
		int inp = input.size();
		long[] inputArr = input.arr();
		int index = 0;
		
		if(og>inp) {
			for(int i = 0; i < inp;i++) {
				for(int j = 0; j < og; j++) {
					long min = inputArr[i];
					if(min < a[j]) {
						merge.insert(min);
					}
					if()
				}
			}
		}
		
		return merge;
	}
	
	
	public long[] arr() {
		return a;
	}
} 