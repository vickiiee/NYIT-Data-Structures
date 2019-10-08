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
		FirstLastList list = new FirstLastList();

		list.insertFirst(1); // insert at front
		list.insertFirst(2);
		list.insertFirst(3);
		list.displayList();
		
		theList.join(list);
		theList.displayList();
		list.displayList();
		//JOIN SUCCESS
		
		System.out.println("\n\nSWAP::");
		theList.displayList();
		theList.swap();
		theList.displayList();
		
		/*
		 * lst1
[1,3,7,4]
lst2
[2,4,5,8,6]
lst1.join(lst2)
[1,3,7,4,2,4,5,8,6]

lst1.swap()
[6,3,7,4,2,4,5,8,1]
		 */
		
		System.out.println("List 1:");
		FirstLastList list1 = new FirstLastList();
		list1.insertLast(1);
		list1.insertLast(3);
		list1.insertLast(7);
		list1.insertLast(4);
		list1.displayList();
		
		System.out.println("\nList 2:");
		FirstLastList list2 = new FirstLastList();
		list2.insertLast(2);
		list2.insertLast(4);
		list2.insertLast(5);
		list2.insertLast(8);
		list2.insertLast(6);
		list2.displayList();
		
		System.out.println("\nList1.join(List2):");
		list1.join(list2);
		
		System.out.println("\nUpdated List 1:");
		list1.displayList();
		
		System.out.println("\nUpdated List 2:");
		list2.displayList();
		
		System.out.println("\nSwap List 1:");
		list1.swap();
		list1.displayList();

	} // end main()
} // end class FirstLastApp
////////////////////////////////////////////////////////////////
