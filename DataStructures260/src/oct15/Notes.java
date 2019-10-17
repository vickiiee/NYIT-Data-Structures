package oct15;

public class Notes {

	public Notes() {
		//CH 6: Recursion
		/*a method that calls itself
		 * 
		 * triangular numbers recursion
		 * 
		 * base case: the condition that stops the recursion so it doesnt go on an infinite loop
		 * 
		 * fib. recursion
		 * 
		 * binary search recursion:
		 * 
		 * divide and conquer algorithms:
		 * merge sort
		 * 
		 */
		
	}

	public int fib(int n) { // figure out how to print it all
		// 0,1,1,2,3,5,8,13,21,
		if (n <= 0) {
			// System.out.print(" 0");
			return 0;
		} else if (n == 1) {
			// System.out.print(" 1");
			return 1;
		} else {
			int r = (fib(n - 1) + fib(n - 2));
			//System.out.print(r + " ");
			return (r);
		}

	}
	
	public int bunnyEars(int n) {
		if(n ==0) {
			return 0;
		}
		if(n%2 ==1){ //odd
			return 2 +bunnyEars(n-1);
		}else  //even
			return 3 + bunnyEars(n-1);	
	}
	
	public int sumOfDigits(int n ) {
		if(n<10) {
			return n;
		}
		
		return n%10 +sumOfDigits(n/10); //recursion!!!!!!!!!!!!!!!! so make sure you return by calling method again!
	}

	public static void main(String[] args) {
		Notes r = new Notes();
		int n = 10;
		for(int i = 0; i <= n; i++) {
			System.out.print(" "+r.fib(i));
		}
		
		System.out.println("\n"+r.bunnyEars(3));
		System.out.println("\n"+r.sumOfDigits(568));
		//0,2,5,7,
	}

}
