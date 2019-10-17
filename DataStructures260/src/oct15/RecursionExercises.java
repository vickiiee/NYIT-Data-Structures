package oct15;

public class RecursionExercises {

	public RecursionExercises() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args) {
		RecursionExercises s = new RecursionExercises();
		System.out.println(s.rangeSum(1, 5));
		System.out.println(s.rangeSum(-3,4));
		
		System.out.println("\n"+s.countX("xxxxxxxx"));
		String p = "dcv";
		System.out.println("\n"+s.countHi("xxxhixhixxxhix"));
		System.out.println(p.substring(2));
		
		System.out.println("\n"+s.changeXY("xxxhixhixxxhix"));
		System.out.println(p.substring(2));
		
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
	
/*
 * 8- Given a string, compute recursively (no loops) the number of lowercase &#39;x&#39; chars in the string.
countX(xxhixx;) = 4
countX(xhixhix) = 3
countX(&quot;hi&quot;) 
 */
	//Ex8
	public int countX(String s) {
		int x = s.indexOf("x");
		if(x== -1) {
			return 0;
		}else {
			return 1+countX(s.substring(x+1));
		}
	}
	
	/*
	 * countHi(&quot;xxhixx&quot;): 1
countHi(&quot;xhixhix&quot;): 2
countHi(&quot;hi&quot;) : 1
	 */
	//Ex 9
	public int countHi(String c) {
		if(c.indexOf("hi")==-1) {
			return 0;
		}else
			return 1+ countHi(c.substring(c.indexOf("hi")+1));
	}
	
	//EX 10:
	public String changeXY(String s) {
		if(s.indexOf("x")==-1) {
			return "";
		}else {
			return s.substring(0, s.indexOf("x"))+"y"+changeXY(s.substring(s.indexOf("x")+1));
		}
	}
}

