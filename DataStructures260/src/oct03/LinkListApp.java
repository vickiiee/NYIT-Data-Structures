package oct03;

//VIckie Wu
//10/03/19

public class LinkListApp {
	public static void main(String[] args) {
		LinkList theList = new LinkList(); // make new list

		theList.insertFirst(1, 2.99); // ignore double
		theList.insertFirst(1, 4.99);
		theList.insertFirst(2, 4.99);
		theList.insertFirst(3, 6);
		theList.insertFirst(4, 5);
		theList.insertFirst(5, 3);
		theList.insertFirst(4, 1);
		theList.insertFirst(3, 6.99);
		theList.insertFirst(2, 8.99);
		theList.insertFirst(1, 4.99);
		theList.insertFirst(1, 8.99);
		//original list
		theList.displayList();

		//removeAll()
		System.out.println("\nRemoveAll(int n): n = 1");
		theList.removeAll(1);
		theList.displayList();

		//removeLast()
		System.out.println("\nRemoveLast(int n): n = 3");
		theList.removeLast(3);
		theList.displayList();

		//removeLast()
		System.out.println("\nRemoveLast(int n): n = 4");
		theList.removeLast(4);
		theList.displayList();

		//removeAll()
		System.out.println("\nRemoveAll(int n): n = 2");
		theList.removeAll(2);
		theList.displayList();
	} // end main()
}
