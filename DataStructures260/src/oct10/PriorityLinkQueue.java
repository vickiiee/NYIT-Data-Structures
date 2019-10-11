package oct10;

public class PriorityLinkQueue extends DoublyLinkedList{

	//sorted linked list
	
	private DoublyLinkedList list; //maybe??
	
	public PriorityLinkQueue() {
		list = new DoublyLinkedList();
	}
	
	public void insert(long key) { //or insert long and make new link
		//smallest -> biggest
		//0,2,5,7,9
		//key = 8
	
		if(isEmpty()) {
			insertFirst(key);
		}else {
			Link current = getFirst();
			while(current != null) {
				//long previous = current.previous.dData;
				long data = current.dData;
				
				if(data>key) {
					/*inset before
					 * make new pathway to new link
					 */
					if(current != getFirst()) {
						Link newLink = new Link(key);
						newLink.next = current;
						newLink.previous = current.previous;
						return;
					}else {
						Link newLink = new Link(key);
						newLink.next = getFirst();
						setFirst(newLink);
						return;
					}
				}
			}
			insertLast(key);
		}
				
	}
	
	public long remove() {
		//just remove last link because if its sorted it should already have the highest in the lst
		return 0;
	}

	
}
