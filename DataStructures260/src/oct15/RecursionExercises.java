package oct15;

//Vickie Wu
//10/15/19

public class RecursionExercises {

	public RecursionExercises() {
		
	}
	
	public static void main (String[] args) {
		RecursionExercises s = new RecursionExercises();
		System.out.println("rangeSum(1,5): "+s.rangeSum(1, 5));
		System.out.println("rangeSum(-3,4): "+s.rangeSum(-3,4));
		System.out.println("rangeSum(6,10): "+s.rangeSum(6,10));
		
		System.out.println("\ncountX(\"xxxxhixxxx\"): "+s.countX("xxxxhixxxx"));
		System.out.println("countX(\"ox hexed fox\"): "+s.countX("ox hexed fox"));
		
		System.out.println("\nchangeXY(\"xou xellow xoxo xes\"): "+s.changeXY("xou xellow xoxo xes"));
		System.out.println("changeXY(\"xAPPLExBANANAxxx\"): "+s.changeXY("xAPPLExBANANAxxx"));
		System.out.println("changeXY(\"alexander xylophone xoxo\"): "+s.changeXY("alexander xylophone xoxo"));
		
	}

	public int rangeSum(int start, int end) {
		if(end ==start) {
			return start;
		}
		return end + rangeSum(start,end-1);
	}
	
	//EX 8:
	public int countX(String s) {
		int x = s.indexOf("x");
		if(x== -1) {
			return 0;
		}else {
			return 1+countX(s.substring(x+1));
		}
	}
	
	//EX 10:
	public String changeXY(String s) {
		if(s.indexOf("x")==-1) {
			return s;
		}else {
			return s.substring(0, s.indexOf("x")) + "y" + changeXY(s.substring(s.indexOf("x")+1));
		}
	}
}

