package oct08;

//Vickie Wu 
//10/8/19

//set up getter/setter
public class Link {
	private  long dData; // data item
	private Link next; // next link in list
//-------------------------------------------------------------

	public Link(long d) { // constructor
		dData = d;
	}

//-------------------------------------------------------------
	public void displayLink() { // display this link
		System.out.print(dData + " ");
	}
//-------------------------------------------------------------

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
} // end class Link
////////////////////////////////////////////////////////////////
