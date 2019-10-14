package oct10;

//Vickie Wu
//10/10/19

public class DoublyLinkedList {
	private Link first; // ref to first item
	private Link last; // ref to last item
// -------------------------------------------------------------

	public DoublyLinkedList() // constructor
	{
		setFirst(null); // no items on list yet
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
			//*change
			Link f = getFirst();
			f.setPrevious(newLink);
			//*getFirst().previous = newLink; // newLink <-- old first
		}
		//*change
		newLink.setNext(getFirst());
		//*newLink.next = getFirst(); // newLink --> old first
		setFirst(newLink); // first --> newLink
	}

// -------------------------------------------------------------
	public void insertLast(long dd) // insert at end of list
	{
		Link newLink = new Link(dd); // make new link
		if (isEmpty()) // if empty list,
			setFirst(newLink); // first --> newLink
		else {
			//*change
			last.setNext(newLink);
			//*last.next = newLink; // old last --> newLink
			
			//*change
			newLink.setPrevious(last);
			//*newLink.previous = last; // old last <-- newLink
		}
		last = newLink; // newLink <-- last
	}

// -------------------------------------------------------------
	public Link deleteFirst() // delete first link
	{ // (assumes non-empty list)
		Link temp = getFirst();
		
		//*change
		Link nTemp = temp.getNext();
		if(nTemp == null) {
		//*if (getFirst().next == null) // if only one item
			
			last = null; // null <-- last
		}else {
			
			//*change
			nTemp.setPrevious(null);
			//*getFirst().next.previous = null; // null <-- old next
		}
		
		//*change
		Link f = getFirst();
		Link n = f.getNext();
		setFirst(n);
		//*setFirst(getFirst().next); // first --> old next
		
		return temp;
	}

// -------------------------------------------------------------
	public Link deleteLast() // delete last link
	{ // (assumes non-empty list)
		Link temp = last;
		
		//*change
		if(getFirst().getNext() ==null) {
		//*if (getFirst().next == null) // if only one item
			setFirst(null); // first --> null
		}else {
			//*change
			last.getPrevious().setNext(null);
			//*last.previous.next = null; // old previous --> null
		}
		//*change
		last = last.getPrevious();
		//*last = last.previous; // old previous <-- last
		return temp;
	}

// -------------------------------------------------------------
	// insert dd just after key
	public boolean insertAfter(long key, long dd) { // (assumes non-empty list)
		Link current = getFirst(); // start at beginning
		//*change
		while(current.getdData()!= key)
		//*while (current.dData != key) // until match is found,
		{
			//*change
			current = current.getNext();
			//*current = current.next; // move to next link
			if (current == null)
				return false; // didn't find it
		}
		Link newLink = new Link(dd); // make new link

		if (current == last) // if last link,
		{
			//*change
			newLink.setNext(null);
			//*newLink.next = null; // newLink --> null
			last = newLink; // newLink <-- last
		} else // not last link,
		{
			//*change
			newLink.setNext(current.getNext());
			//*newLink.next = current.next; // newLink --> old next
											// newLink <-- old next
			//*change
			current.getNext().setPrevious(newLink);
			//*current.next.previous = newLink;
		}
		//*change
		newLink.setPrevious(current);
		current.setNext(newLink);
		//*newLink.previous = current; // old current <-- newLink
		//*current.next = newLink; // old current --> newLink
		return true; // found it, did insertion
	}

// -------------------------------------------------------------
	public Link deleteKey(long key) // delete item w/ given key
	{ // (assumes non-empty list)
		Link current = getFirst(); // start at beginning
		//*change
		while(current.getdData()!=key)
		//*while (current.dData != key) // until match is found,
		{
			//*change
			current = current.getNext();
			//*current = current.next; // move to next link
			if (current == null)
				return null; // didn't find it
		}
		if (current == getFirst()) { // found it; first item?
			//*change
			setFirst(current.getNext());
			//*setFirst(current.next); // first --> old next
		}else { // not first
				// old previous --> old next
			//*change
			current.getPrevious().setNext(current.getNext());
			//*current.previous.next = current.next;
		}
		
		if (current == last) // last item?
			//*change
			last = current.getPrevious();
			//*last = current.previous; // old previous <-- last
		else // not last
				// old previous <-- old next
			//*change
			current.getNext().setPrevious(current.getPrevious());
			//*current.next.previous = current.previous;
		return current; // return value
	}

// -------------------------------------------------------------
	public void displayForward() {
		System.out.print("List (first-->last): ");
		Link current = getFirst(); // start at beginning
		while (current != null) // until end of list,
		{
			current.displayLink(); // display data
			//*change
			current = current.getNext();
			//*current = current.next; // move to next link
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
			//*change
			current = current.getPrevious();
			//*current = current.previous; // move to previous link
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
