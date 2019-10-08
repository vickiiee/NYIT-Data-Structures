package oct03;

//VIckie Wu
//10/03/19

public class Link {
	public int iData; // data item
	public double dData; // data item
	public Link next; // next link in list
	public Link previous;
//-------------------------------------------------------------

	public Link(int id, double dd) // constructor
	{
		iData = id; // initialize data
		dData = dd; // ('next' is automatically
	} // set to null)
//-------------------------------------------------------------

	public void displayLink() // display ourself
	{
		System.out.print("{" + iData +  "} "); //my edit
		//System.out.print("{" + iData + ", " + dData + "} ");
	}
	
	//Added methods
	public int getiData() { //int
		return iData;
	}
	
	public double getdData() { //double
		return dData;
	}
	
	public Link getNext() { //link
		return next;
	}
	
} // end class Link
////////////////////////////////////////////////////////////////
