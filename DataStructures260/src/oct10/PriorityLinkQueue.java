package oct10;

public class PriorityLinkQueue extends DoublyLinkedList {

	// sorted linked list
	
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
						/*
						 * Link newLink = new Link(key); newLink.next = getFirst(); setFirst(newLink);
						 */
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

}
