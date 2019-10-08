package oct03;

//VIckie Wu
//10/03/19

public class LinkListApp {
	public static void main(String[] args) {
		/*
		 * Your main() should print a message stating which method is called, and the contents of the list before and after any of the above methods is called.
		 */
		LinkList theList = new LinkList(); // make new list

		theList.insertFirst(10, 2.99); // insert four items
		theList.insertFirst(10, 4.99);
		theList.insertFirst(20, 4.99);
		theList.insertFirst(30, 6);
		theList.insertFirst(40, 5);
		theList.insertFirst(50, 3);
		theList.insertFirst(40, 1);
		theList.insertFirst(30, 6.99);
		theList.insertFirst(20, 8.99);
		theList.insertFirst(10, 4.99);
		theList.insertFirst(10, 8.99);
		
		
		theList.displayList(); // display list
		System.out.println("RemoveAll(int n): n = 10");
		//theList.removeLast(30);
		theList.removeAll(10);
		theList.displayList();
		
		System.out.println("\nRemoveLast(int n): n = 30");
		theList.removeLast(30);
		
		//theList.deleteLast(30);
		
		
		theList.displayList();
		
		System.out.println("\nRemoveLast(int n): n = 40");
		theList.removeLast(40);
		theList.displayList();


		while (!theList.isEmpty()) // until it's empty,
		{
			Link aLink = theList.deleteFirst(); // delete link
			System.out.print("Deleted "); // display it
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayList(); // display list
	} // end main()
} 
