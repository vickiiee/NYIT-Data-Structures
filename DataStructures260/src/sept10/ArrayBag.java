package sept10;

//Vickie Wu
//9/10/19

public class ArrayBag implements Bag {

	private Object[] arr;
	private int maxSize;
	private int index;

	public ArrayBag() {
		arr = new Object[50];
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
			System.out.println("Bag Full! Cannot add " + item + "!");
		} else {
			arr[index] = item;
			index++;
		}

		return false;
	}

	@Override
	public boolean remove(Object item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				index = index -1;
				
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
				arr[arr.length - 1] = null;
				return false;
			}
		}
		System.out.println(item + " not found!");

		return false;
	}

	@Override
	public boolean contains(Object item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public int numItems() {
		int elements = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				elements = elements + 1;
			}
		}
		
		//return elements;
		return arr.length;
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
		if (newBag.numItems() > numItems()) {
			return false;
		}
		
		Object[] ph = newBag.toArray(); //ph = placeHolder
		
		for (int i = 0; i < arr.length; i++) {
			if (contains(ph[i]) == false) {
				return false;
			}
		}
		
		return true;
	}

}
