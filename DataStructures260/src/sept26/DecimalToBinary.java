package sept26;

public class DecimalToBinary {

	private long decimal;
	private long remainder;
	
	private String binary;
	
	private StackX theStack;

	public DecimalToBinary(long num) {
		decimal = num;
		System.out.println("Decimal is: " + num);
		
		binary = ""; //make sure to assign it to empty or it will be considered null when concatenating : ex: "null01010"
		remainder = 0;
		theStack = new StackX(100); // make new stack
	}

	public void convert() {

		while (decimal >= 1) { //if its not less than 1
			remainder = decimal % 2; //get remainder which will be pushed to stack
			decimal = decimal / 2; 

			theStack.push(remainder);
		}
	}

	public void display() {
		while (!theStack.isEmpty()) { // until it's empty,
			// delete item from stack
			long value = theStack.pop();
			
			/**System.out.print(value); // display it
			System.out.print(" ");**/
			
			binary += value;
		} // end while
		System.out.println("Binary is: "+binary);
	}

}
