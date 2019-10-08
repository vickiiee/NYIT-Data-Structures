package oct08;

//Vickie Wu 
//10/8/19

public class FirstLastApp {
	public static void main(String[] args) { // make a new list
		System.out.println("List 1:");
		FirstLastList theList = new FirstLastList();

		theList.insertFirst(22); // insert at front
		theList.insertFirst(44);
		theList.insertFirst(66);

		theList.insertLast(11); // insert at rear
		theList.insertLast(33);
		theList.insertLast(55);

		theList.displayList(); // display the list

		theList.deleteFirst(); // delete first two items
		theList.deleteFirst();

		theList.displayList(); // display again

		System.out.println("\n\nList 2:");
		FirstLastList list2 = new FirstLastList();

		list2.insertFirst(1); // insert at front
		list2.insertFirst(2);
		list2.insertFirst(3);
		list2.displayList();
		
		theList.join(list2);
		theList.displayList();
		list2.displayList();
		//JOIN SUCCESS

	} // end main()
} // end class FirstLastApp
////////////////////////////////////////////////////////////////
