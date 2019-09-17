package sept12;

//Vickie Wu
//9/12/19
public class HighArrayApp {

	public static void main(String[] args) {
		int maxSize = 100; 
		HighArray arr = new HighArray(maxSize); 

		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.display();
		
		int searchKey = 35;
		if (arr.find(searchKey))
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can't find " + searchKey);
		
		arr.delete(00); 
		arr.delete(55);
		arr.delete(15);
		arr.display();
		
		System.out.println("\n.getMax() returned " + arr.getMax());
		
		System.out.println("\nAfter calling .removeMax()");
		arr.removeMax();
		arr.display();

		//-------------2.3----Sorting using .removeMax();---------------------------------------
		System.out.println("\nSorting:");
		long[] inverse = new long[maxSize];
		int index = 0;

		while (arr.getMax() != -1) {
			inverse[index] = arr.removeMax();
			index++;
		}
		
		System.out.println("\nInverse Array:");
		for (int i = 0; i < index; i++) {
			System.out.print(inverse[i] + " ");
		}
		
		
		//-----------TESTING------------
		
				/*//----test .find()----
				System.out.println(arr.find(33));
				*/
				
				/*//----test .getMax-----
				System.out.println("Max: "+arr.getMax());
				*/
				
				/*//----test .delete----
				System.out.println("");
				arr.delete(00); 
				arr.delete(55);
				arr.delete(99);
				arr.delete(15); 
				arr.delete(12);
				arr.delete(66);
				arr.display();*/

	}
}
