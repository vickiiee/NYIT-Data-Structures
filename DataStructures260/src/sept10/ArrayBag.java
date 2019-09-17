package sept10;

//Vickie Wu
//9/10/19

public class ArrayBag implements Bag {

	private Object[] arr;
	private int maxSize;
	private int index;

	private static final int DEFAULT_MAX_SIZE = 50;

	public ArrayBag() {
		arr = new Object[DEFAULT_MAX_SIZE];
		maxSize = 50;
		index = 0;
	}

	public ArrayBag(int initSize) {
		if (initSize <= 0) {
			throw new IllegalArgumentException("max size must be > 0");
		}
		arr = new Object[initSize];
		maxSize = initSize;
		index = 0;
	}

	@Override
	public boolean add(Object item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}

		if (index == maxSize) {
			System.out.println("Bag Full! Cannot add " + item);
		} else {
			arr[index] = item;
			index = index + 1;
			return true;
		}

		return false;
	}

	@Override
	public boolean remove(Object item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}

		if (item == arr[maxSize - 1]) { 						//if item = last element
			index = index - 1;
			arr[maxSize - 1] = null;
			return true;
		}

		for (int i = 0; i < index; i++) { 						//for every element in the array (that is not null)
			if (arr[i] == item) {
				index = index - 1;
		
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1]; 						//move every element (from the matched element) down one index
				}
				arr[arr.length - 1] = null; 					//last element has to be null
				return true;
			}
		}
		System.out.println(item + " not found!");

		return false;
	}

	@Override
	public boolean contains(Object item) {
		for (int i = 0; i < index; i++) {						// for every element in the array (that is not null)
			if (arr[i] == item) {
				return true;
			}
		}

		return false;
	}

	@Override
	public int numItems() {
		return index;
	}

	@Override
	public Object grab() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		return arr;
	}

	public boolean containsAll(ArrayBag newBag) {
		if (newBag.numItems() > numItems()) { 					//if newBag is bigger than the original bag
			return false;
		}

		Object[] ph = newBag.toArray(); 						// ph = placeHolder

		for (int i = 0; i < newBag.numItems(); i++) { 			//for every element in newBag (that is not null)
			if (contains(ph[i]) == false) { 					//if original array does not contain this element from newBag
				return false;									//return false
			}
		}

		return true;
	}

}
