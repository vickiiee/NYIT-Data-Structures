package oct10;

//Vickie Wu
//10/10/19

public class DoublyLinkedApp {
	public static void main(String[] args) { // make a new list
		System.out.println("Priority Queue:");
		PriorityLinkQueue list = new PriorityLinkQueue();
		list.insertPriority(8);
		list.insertPriority(5);
		list.insertPriority(7);
		list.insertPriority(9);
		list.insertPriority(3);
		list.insertPriority(2);
		list.insertPriority(6);
		list.insertPriority(1);
		list.insertPriority(50);
		list.insertPriority(4);
		list.insertPriority(10);
		list.insertPriority(100);
		list.insertPriority(60);
		list.insertPriority(30);
		list.insertPriority(0);
		list.displayForward();

		System.out.println("\nRemove() returns "+list.remove());
		list.displayForward();

		System.out.println("\nRemove() returns "+list.remove());
		list.displayForward();
		
		System.out.println("\nRemove() returns "+list.remove());
		list.displayForward();
		
		System.out.println("\nRemove() returns "+list.remove());
		list.displayForward();
	} // end main()
}
