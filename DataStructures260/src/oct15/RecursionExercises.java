package oct15;

public class RecursionExercises {

	public RecursionExercises() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args) {
		RecursionExercises s = new RecursionExercises();
		System.out.println(s.rangeSum(1, 5));
		System.out.println(s.rangeSum(-3,4));
		
	}

	/*
	 * Define a recursive rangeSum(from, to) method that calculates and prints the sum of numbers between the two values inclusive.

rangeSum(1,5)  -> 15
rangeSum(1,5)  -> 1+2+3+4+5=15
rangeSum(-3,4) -> -3+-2+-1+0+1+2+3+4=4
	 */
	
	public int rangeSum(int start, int end) {
		if(end ==start) {
			return start;
		}
		return end + rangeSum(start,end-1);
	}
}
