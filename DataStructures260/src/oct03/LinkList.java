package oct03;

public class LinkList {
	private Link first; // ref to first link on list
	private boolean toggle;
	private Link last;

//-------------------------------------------------------------
	public LinkList() // constructor
	{
		first = null; // no links on list yet
		toggle = false;
	}

//-------------------------------------------------------------
	public boolean isEmpty() // true if list is empty
	{
		return (first == null);
	}

//-------------------------------------------------------------
	// insert at start of list
	public void insertFirst(int id, double dd) { // make new link
		Link newLink = new Link(id, dd);
		newLink.next = first; // newLink --> old first
		//mine
		//newLink.next.previous = first;
		if(toggle ==true) {
			Link t = newLink.next;
		t.previous = newLink;
		}
		
		
		first = newLink; // first --> newLink
		
		if(toggle = false) {
			toggle = true;
			last =newLink ;
		}
		
	}

//-------------------------------------------------------------
	public Link deleteFirst() // delete first item
	{ // (assumes list not empty)
		Link temp = first; // save reference to link
		first = first.next; // delete it: first-->old next //reference 
		return temp; // return deleted link
	}

//-------------------------------------------------------------
	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	
	//review
	public Link delete(int key) {
		Link current = first;
		Link previous = first;

		while (current.iData != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first) {
			first = first.next;
		} else {
			previous.next = current.next;
		}

		return current;

	}
	
	public Link deleteLast(int key, int counter) {
	 	int num = 0;
		Link c = first;
		Link previous = first;


		while (c.iData != key || (c.iData == key && num!=counter-1)) {
			if (c.next == null) {
				return null;
			} else {
			num++;
				previous = c;
				c = c.next;
			}
		}
		if (c == first) {
			first = first.next;
		} else {
			previous.next = c.next;
		}

		return c;

	}
	
	public void removeAll(int n) {
		Link current = first; // start at beginning of list
		while (current != null) // until end of list,
		{
			delete(n);
			current = current.next; // move to next link
		}	
		
	}

	public void removeLast(int n) {
		//make counter 
		/**
		 * if 1, just use delete, 
		 * 
		 * once u get all the counters, reiterate again and once the num of tiiems matches the counter, remove it.
		 */
		
		//find out how many links have the key
		Link current = first; // start at beginning of list
		int counter = 0;
		while (current != null) // until end of list,
		{	
			if(current.getiData() == n){
				counter ++;
			}
			current = current.next; // move to next link
		}	
		
		if(counter == 1) {
			delete(n);
		}else if(counter >1) {
			//int num = 0;
			deleteLast(n, counter);
			/*
			while (current != null) // until end of list,
			{	
				if(current.getiData() == n){
					num ++;
				}
				
				if(current.getiData() == n && num == counter-1){
					current = current.next;
					return;
				}
				current = current.next; // move to next link
			}*/
			
		}
	}
	
	
	public void getSize() {
		Link current = first; // start at beginning of list
		//size = 0; 
		while (current != null) // until end of list,
		{
			//size++;
			current = current.next; // move to next link
		}
	}
	
	
//-------------------------------------------------------------
} // end class LinkList
////////////////////////////////////////////////////////////////