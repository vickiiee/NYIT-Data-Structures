package oct03;

//VIckie Wu
//10/03/19

public class Link {
	private int iData; // data item
	private double dData; // data item
	private Link next; // next link in list
//-------------------------------------------------------------

	public Link(int id, double dd) // constructor
	{
		iData = id; // initialize data
		dData = dd; // ('next' is automatically
	} // set to null)
//-------------------------------------------------------------

	public void displayLink() // display ourself
	{
		System.out.print("{" + iData + "} "); // my edit
		// System.out.print("{" + iData + ", " + dData + "} ");
	}

	// Added methods
	public int getiData() { // int
		return iData;
	}

	public double getdData() { // double
		return dData;
	}

	public Link getNext() { // link
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

} // end class Link

