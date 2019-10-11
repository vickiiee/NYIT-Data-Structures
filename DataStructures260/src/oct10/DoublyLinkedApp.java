package oct10;

public class DoublyLinkedApp {
	public static void main(String[] args) { // make a new list
		DoublyLinkedList theList = new DoublyLinkedList();

		theList.insertFirst(22); // insert at front
		theList.insertFirst(44);
		theList.insertFirst(66);

		theList.insertLast(11); // insert at rear
		theList.insertLast(33);
		theList.insertLast(55);

		theList.displayForward(); // display list forward
		theList.displayBackward(); // display list backward

		theList.deleteFirst(); // delete first item
		theList.deleteLast(); // delete last item
		theList.deleteKey(11); // delete item with key 11

		theList.displayForward(); // display list forward

		theList.insertAfter(22, 77); // insert 77 after 22
		theList.insertAfter(33, 88); // insert 88 after 33

		theList.displayForward(); // display list forward
		
		
		System.out.println("Priority Queue");
		PriorityLinkQueue test = new PriorityLinkQueue();
	//	test.displayForward();
	//	test.insert(57);
		//test.insert(28);
		//test.insert(3);
	//	test.insert(100);
		//test.insert(28);
		System.out.println("\nPriority Queue");
		//test.insert(3); 
//		test.displayForward();
	//	test.displayForward();
	} // end main()
} 