package oct10;

//Vickie Wu
//10/10/19

public class Link {
	private long dData; // data item
	private Link next; // next link in list
	private Link previous; // previous link in list
	// -------------------------------------------------------------

	public Link(long d) // constructor
	{
		dData = d;
	}

	// -------------------------------------------------------------
	public void displayLink() // display this link
	{
		System.out.print(dData + " ");
	}
	// -------------------------------------------------------------
	
	public long getdData() {
		return dData;
	}

	public void setdData(long dData) {
		this.dData = dData;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public Link getPrevious() {
		return previous;
	}

	public void setPrevious(Link previous) {
		this.previous = previous;
	}
}