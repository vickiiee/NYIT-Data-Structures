package oct08;

//Vickie Wu 
//10/8/19

public class FirstLastList {
	private Link first; // ref to first link
	private Link last; // ref to last link

	public FirstLastList() // constructor
	{
		first = null; // no links on list yet
		last = null;
	}

	//------------------------------------------swap() -------------------------------------
	public void swap() {
		// check out size
		int size = 0;
		Link current = first;
		while (current != null) {
			size++;
			current = current.getNext();
		}
		if (size < 2) {
			System.out.println("List must have at least 2 links. Modify it.");
			return;
		}

		// get data and change data
		//Original Code

		/*
		Long headData = last.getdData();
		Long tailData = first.getdData();

		first.setdData(headData);
		last.setdData(tailData);
		*/
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//actual swapping links instead of elements: finally figured it out
		Link c = first;
		Link pre = first;
		while(c!=null) {
			if(c.getNext() == null) {
				break;
			}
			//get links for the last and second to last links
			pre = c;
			c=c.getNext();
		}
		
		Link sec = first.getNext(); //access to second link
		
		Link temp = first;
		first = c;
		c = temp;
		
		first.setNext(sec);
		c.setNext(null);
		pre.setNext(c);
	}

	//---------------------------join(list list)---------------------------------------------------------
	public void join(FirstLastList SecondList) {
		Link current = SecondList.first;
		while (current != null) {
			insertLast(SecondList.deleteFirst());
			current = current.getNext();
		}
	}

	//--------------------------------------------------------------------------------------------------------------------------------------------
	public boolean isEmpty() // true if no links
	{
		return first == null;
	}

	public void insertFirst(long dd) // insert at front of list
	{
		Link newLink = new Link(dd); // make new link

		if (isEmpty()) // if empty list,
			last = newLink; // newLink <-- last
		newLink.setNext(first); // newLink --> old first
		first = newLink; // first --> newLink
	}

	public void insertLast(long dd) // insert at end of list
	{
		Link newLink = new Link(dd); // make new link
		if (isEmpty()) // if empty list,
			first = newLink; // first --> newLink
		else
			last.setNext(newLink); // old last --> newLink
		last = newLink; // newLink <-- last
	}

	public long deleteFirst() // delete first link
	{ // (assumes non-empty list)
		long temp = first.getdData();
		if (first.getNext() == null) // if only one item
			last = null; // null <-- last
		first = first.getNext(); // first --> old next
		return temp;
	}
	
	public void displayList() {
		// System.out.print("List (first-->last): ");
		Link current = first; // start at beginning
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.getNext(); // move to next link
		}
		System.out.println("");
	}
}