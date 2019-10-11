package oct03;

//VIckie Wu
//10/03/19

public class LinkList {
	private Link first; // ref to first link on list

	public LinkList() // constructor
	{
		first = null; // no links on list yet
	}

	// -----------removeALL()----------------------
	public LinkList removeAll(int n) {
		LinkList p = new LinkList();
		/////////////////////////////////////////////////////////////////////////////////////////////////
		// MY Originl code that worked, but wasnt efficient and had o(n^2)/ long runtime

		/*
		 * Link current = first; // start at beginning of list
		 * 
		 * while (current != null) // until end of list, { delete(n); current =
		 * current.getNext(); // move to next link }
		 */

		//////////////////////////////////////////////////////////////////////////////////////////////////
		//MY new code written exactly one week later after i understand linklists better and reviewed the delete method. More efficient!
		
		Link current = first;
		Link previous = first;
		while (current != null) {
			int i = current.getiData();
			if (i == n) {
				if (current == first) { 					// first
					//System.out.println("	first");
					first = first.getNext();
					previous = first;
					current = first;
					//displayList();
				} else if (current.getNext() == null) {		// last
					//System.out.println("	last");
					previous.setNext(null);
					current = null;
					break;
				} else {									// middle
					//System.out.println("	middle");
					//displayList();
					previous.setNext(current.getNext());
					current = current.getNext();
				}
			} else {
				previous = current;
				current = current.getNext();
			}

		}
		////////////////////////////////////////////////////////////////////////////////////////////////////
		// new LinkList has the results of original LinkList (basically a duplicate)
		Link c = first;
		while (c != null) // until end of list,
		{
			p.insertFirst(c.getiData(), c.getdData());
			c = c.getNext(); // move to next link
		}
		return p;
	}

	// -----------removeLast()----------------------
	public void removeLast(int n) {
		// make counter
		/**
		 * if 1, just use delete once u get all the counters, reiterate again and once
		 * the num of times matches the counter, remove it.
		 */

		// find out how many links have the key
		Link current = first; // start at beginning of list
		int counter = 0;
		while (current != null) // until end of list,
		{
			if (current.getiData() == n) {
				counter++;
			}
			current = current.getNext(); // move to next link
		}
		// System.out.println("counter: "+ counter);
		if (counter == 1) {
			delete(n);
		} else if (counter > 1) {
			deleteLast(n, counter);
		}
	}

	// helper method
	public Link deleteLast(int key, int counter) {
		int num = 0;
		Link c = first;
		Link previous = first;

		while (c.getiData() != key || (c.getiData() == key && num != counter - 1)) {
			if (c.getNext() == null) {
				return null;
			} else {
				if (c.getiData() == key) {
					num++;
				}
				// System.out.println("Num: "+num);
				previous = c;
				c = c.getNext();
			}
		}

		if (c == first) {
			first = first.getNext();
		} else {
			previous.setNext(c.getNext());
		}

		return c;
	}

//------------------------------------------------------------------------------------------------------------------------------------------------
	public boolean isEmpty() // true if list is empty
	{
		return (first == null);
	}

	// insert at start of list
	public void insertFirst(int id, double dd) { // make new link
		Link newLink = new Link(id, dd);
		newLink.setNext(first); // newLink --> old first
		first = newLink; // first --> newLink
	}

	public Link deleteFirst() // delete first item
	{ // (assumes list not empty)
		Link temp = first; // save reference to link
		first = first.getNext(); // delete it: first-->old next //reference
		return temp; // return deleted link
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.getNext(); // move to next link
		}
		System.out.println("");
	}

	// review
	public Link delete(int key) { // deletes the first element that has key and ignores any other element after
									// that has the key
		Link current = first;
		Link previous = first;

		while (current.getiData() != key) {
			if (current.getNext() == null) {
				return null;
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		if (current == first) {
			first = first.getNext();
		} else {
			previous.setNext(current.getNext());
		}

		return current;
	}
}