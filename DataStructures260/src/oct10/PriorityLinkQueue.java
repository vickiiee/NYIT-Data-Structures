package oct10;

//Vickie Wu
//10/10/19

public class PriorityLinkQueue{

	// sorted linked list
	/*
	public PriorityLinkQueue() {

	}

	public void insertSort(long key) { // or insert long and make new link
		System.out.println("\n	method called: " + key);
		// smallest -> biggest
		// 0,2,5,7,9
		// key = 8

		if (isEmpty()) {
			System.out.println("	isEmpty");
			insertFirst(key);
		} else {

			Link current = getFirst();
			long data = current.dData;
			while (current != null) {
				// 0,2,5,7,9
				// key = 8
				System.out.println("		while loop");
				// long previous = current.previous.dData;
				data = current.dData;

				if (data >= key) {
					// insert before
					// make new pathway to new link

					if (current != getFirst()) {
						
						Link newLink = new Link(key);

						current.previous.next = newLink;
						newLink.previous = current.previous;

						newLink.next = current;
						current.previous = newLink;

						return;
					} else {
						insertFirst(key);
						return;
					}
				}
				current = current.next;
			}
			insertLast(key);
		}

	}

	public long remove() {
		// just remove last link because if its sorted it should already have the
		// highest in the lst
		Link l = deleteLast();
		long value = l.dData;
		return value;
	}
	*/
	
	private DoublyLinkedList list;
	
	public PriorityLinkQueue() {
		list = new DoublyLinkedList();
	}

	public void insertSort(long key) { // or insert long and make new link
		System.out.println("\n	method called: " + key);
		// smallest -> biggest
		// 0,2,5,7,9
		// key = 8

		if (list.isEmpty()) {
			System.out.println("	isEmpty");
			list.insertFirst(key);
		} else {
			Link current = list.getFirst();
			long data = current.dData;
			while (current != null) {
				// 0,2,5,7,9
				// key = 8
				System.out.println("		while loop");
				// long previous = current.previous.dData;
				data = current.dData;

				if (data >= key) {
					// insert before
					// make new pathway to new link

					if (current != list.getFirst()) {
						/*
						 * Link newLink = new Link(key); newLink.next = current; newLink.previous =
						 * current.previous;
						 */
						Link newLink = new Link(key);

						current.previous.next = newLink;
						newLink.previous = current.previous;

						newLink.next = current;
						current.previous = newLink;

						return;
					} else {
						list.insertFirst(key);
						return;
					}
				}
				current = current.next;
			}
			list.insertLast(key);
		}

	}

	public long remove() {
		// just remove last link because if its sorted it should already have the
		// highest in the lst
		Link l = list.deleteLast();
		long value = l.dData;
		return value;
	}
	
	public void displayForward() {
		list.displayForward();
	}
	
	public void displayBackward() {
		list.displayBackward();
	}

}
