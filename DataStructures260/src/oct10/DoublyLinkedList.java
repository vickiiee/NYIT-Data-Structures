package oct10;

//Vickie Wu
//10/10/19

public class DoublyLinkedList {
	private Link first; // ref to first item
	private Link last; // ref to last item
	
	public void insertPriority(long key) { 
		//System.out.println("\n	method called: " + key);
		// smallest -> biggest
		// 0,2,5,7,9
		// key = 8

		if (isEmpty()) {
			//System.out.println("	isEmpty");
			insertFirst(key);
		} else {
			Link current = getFirst();
			long data = current.getdData();
			while (current != null) {
				//System.out.println("		while loop");
				data = current.getdData();
				
				if (data >= key) {
					// insert before; make new pathways to new link
					if (current != getFirst()) {
						Link newLink = new Link(key);

						current.getPrevious().setNext(newLink);
						newLink.setPrevious(current.getPrevious());

						newLink.setNext(current);
						current.setPrevious(newLink);

						return;
					} else {
						insertFirst(key);
						return;
					}
				}
				current = current.getNext();
			}
			insertLast(key);
		}

	}
// -------------------------------------------------------------

	public DoublyLinkedList() // constructor
	{
		first = null; // no items on list yet
		last = null;
	}

// -------------------------------------------------------------
	public boolean isEmpty() // true if no links
	{
		return getFirst() == null;
	}

// -------------------------------------------------------------
	public void insertFirst(long dd) // insert at front of list
	{
		Link newLink = new Link(dd); // make new link

		if (isEmpty()) // if empty list,
			last = newLink; // newLink <-- last
		else {
			getFirst().setPrevious(newLink);// newLink <-- old first
		}
		newLink.setNext(getFirst());// newLink --> old first
		setFirst(newLink); // first --> newLink
	}

// -------------------------------------------------------------
	public void insertLast(long dd) // insert at end of list
	{
		Link newLink = new Link(dd); // make new link
		if (isEmpty()) // if empty list,
			setFirst(newLink); // first --> newLink
		else {
			last.setNext(newLink);// old last --> newLink
			newLink.setPrevious(last);// old last <-- newLink
		}
		last = newLink; // newLink <-- last
	}

// -------------------------------------------------------------
	public Link deleteFirst() // delete first link
	{ // (assumes non-empty list)
		Link temp = getFirst();
	
		if(getFirst().getNext() == null) {// if only one item
			last = null; // null <-- last
		}else {
			getFirst().getNext().setPrevious(null);// null <-- old next
		}
		
		setFirst(getFirst().getNext());// first --> old next
		
		return temp;
	}

// -------------------------------------------------------------
	public Link deleteLast() // delete last link
	{ // (assumes non-empty list)
		Link temp = last;
		
		if(getFirst().getNext() ==null) {// if only one item 
			setFirst(null); // first --> null
		}else {
			last.getPrevious().setNext(null);// old previous --> null
		}

		last = last.getPrevious();// old previous <-- last
		return temp;
	}

// -------------------------------------------------------------
	// insert dd just after key
	public boolean insertAfter(long key, long dd) { // (assumes non-empty list)
		Link current = getFirst(); // start at beginning

		while(current.getdData()!= key)// until match is found,
		{
			current = current.getNext(); // move to next link
			if (current == null)
				return false; // didn't find it
		}
		Link newLink = new Link(dd); // make new link

		if (current == last) // if last link,
		{
			newLink.setNext(null);// newLink --> null
			last = newLink; // newLink <-- last
		} else // not last link,
		{
			newLink.setNext(current.getNext());// newLink --> old next
			current.getNext().setPrevious(newLink);// newLink <-- old next
		}
		newLink.setPrevious(current); // old current <-- newLink
		current.setNext(newLink);// old current --> newLink
		return true; // found it, did insertion
	}

// -------------------------------------------------------------
	public Link deleteKey(long key) // delete item w/ given key
	{ // (assumes non-empty list)
		Link current = getFirst(); // start at beginning
		
		while(current.getdData()!=key)// until match is found,
		{
			current = current.getNext();// move to next link 
			if (current == null)
				return null; // didn't find it
		}
		if (current == getFirst()) { // found it; first item?
			setFirst(current.getNext());// first --> old next 
		}else { // not first
				// old previous --> old next
			current.getPrevious().setNext(current.getNext());
		}
		
		if (current == last) // last item?
			last = current.getPrevious();// old previous <-- last
		else // not last
				// old previous <-- old next
			current.getNext().setPrevious(current.getPrevious());
		return current; // return value
	}

// -------------------------------------------------------------
	public void displayForward() {
		System.out.print("List (first-->last): ");
		Link current = getFirst(); // start at beginning
		while (current != null) // until end of list,
		{
			current.displayLink(); // display data
			current = current.getNext(); // move to next link
		}
		System.out.println("");
	}

// -------------------------------------------------------------
	public void displayBackward() {
		System.out.print("List (last-->first): ");
		Link current = last; // start at end
		while (current != null) // until start of list,
		{
			current.displayLink(); // display data
			current = current.getPrevious();// move to previous link
		}
		System.out.println("");
	}
// -------------------------------------------------------------

	public Link getFirst() {
		return first;
	}

	public void setFirst(Link first) {
		this.first = first;
	}
	
	public Link getLast() {
		return last;
	}
	
	public void setLast(Link last) {
		this.last = last;
	}
} // end class DoublyLinkedList
