package oct10;

//Vickie Wu
//10/10/19

public class DoublyLinkedApp {
	public static void main(String[] args) { // make a new list
		System.out.println("Priority Queue:");
		PriorityLinkQueue list = new PriorityLinkQueue();
		list.insertSort(8);
		list.insertSort(5);
		list.insertSort(7);
		list.insertSort(9);
		list.insertSort(3);
		list.insertSort(2);
		list.insertSort(6);
		list.insertSort(1);
		list.insertSort(50);
		list.insertSort(4);
		list.insertSort(10);
		list.insertSort(100);
		list.insertSort(60);
		list.insertSort(30);
		list.insertSort(0);
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