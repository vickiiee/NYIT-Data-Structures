package sept26;

//VIckie Wu
//9/26/19

public class StackApp {
	public static void main(String[] args) {
		
		DecimalToBinary test = new DecimalToBinary(233);
		test.convert();
		test.display();
		
		System.out.println();
		DecimalToBinary test1 = new DecimalToBinary(2019);
		test1.convert();
		test1.display();

		System.out.println();
		DecimalToBinary test2 = new DecimalToBinary(24);
		test2.convert();
		test2.display();
	} // end main()

} 