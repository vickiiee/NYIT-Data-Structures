package oct10;

//Vickie Wu
//10/10/19

public class PriorityLinkQueue{

	private DoublyLinkedList list;
	
	public PriorityLinkQueue() {
		list = new DoublyLinkedList();
	}

	public void insertSort(long key) { // or insert long and make new link
		//System.out.println("\n	method called: " + key);
		// smallest -> biggest
		// 0,2,5,7,9
		// key = 8

		if (list.isEmpty()) {
			//System.out.println("	isEmpty");
			list.insertFirst(key);
		} else {
			Link current = list.getFirst();
			long data = current.getdData();
			while (current != null) {
				//System.out.println("		while loop");
				data = current.getdData();
				
				if (data >= key) {
					// insert before; make new pathways to new link
					if (current != list.getFirst()) {
						Link newLink = new Link(key);

						current.getPrevious().setNext(newLink);
						newLink.setPrevious(current.getPrevious());

						newLink.setNext(current);
						current.setPrevious(newLink);

						return;
					} else {
						list.insertFirst(key);
						return;
					}
				}
				current = current.getNext();
			}
			list.insertLast(key);
		}

	}

	public long remove() {
		// just remove last link because list should already be sorted so highest # will already be on the right/last
		return list.deleteLast().getdData();
	}
	
	public void displayForward() {
		list.displayForward();
	}
	
	public void displayBackward() {
		list.displayBackward();
	}

}
