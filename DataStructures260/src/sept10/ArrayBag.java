package sept10;

//Vickie Wu
//9/10/19

public class ArrayBag implements Bag {

	private Object[] arr;
	private int maxSize;
	private int index;
	private int elements;
	//elements = index
	
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
			System.out.println("Bag Full! Cannot add " + item);// + "!"
		} else {
			arr[index] = item;
			index = index + 1;
			System.out.println("i++: " + index);// + "!"
		}

		return false;
	}

	@Override
	public boolean remove(Object item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}

		if (item == arr[maxSize - 1]) {
			index = index - 1;
			arr[maxSize - 1] = null;
			//System.out.println("i--: " + index);
			return true;
		}

		for (int i = 0; i < index; i++) {
			if (arr[i] == item) {
				index = index - 1;
				//System.out.println("i--: " + index);
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[arr.length - 1] = null;
				return true;
			}
		}
		System.out.println(item + " not found!");

		return false;
	}

	@Override
	public boolean contains(Object item) {
		//int c = -1;
		for (int i = 0; i < index; i++) {// arr.length
			//c++;
			//System.out.println(arr.length + "----" + c + "----" + arr[i]);
			if (arr[i] == item) {
				//System.out.println(item + ":item--------arr:" + arr[i]);
				return true;
			}
		}

		return false;
	}

	@Override
	public int numItems() {
		elements = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				elements = elements + 1;
			}
		}

		return elements;
		// return arr.length; //tsting
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
		//System.out.println(elements + ":elements --------index" + index);
		if (newBag.numItems() > numItems()) {
			//System.out.println("--------" + newBag.numItems());
			return false;
		}

		Object[] ph = newBag.toArray(); // ph = placeHolder

		for (int i = 0; i < newBag.numItems(); i++) {
			if (contains(ph[i]) == false) {
				//System.out.println("-false-" + ph[i]); //test
				return false;
			}
		}

		return true;
	}

}
