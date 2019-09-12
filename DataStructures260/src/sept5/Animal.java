package sept5;

public class Animal {
	
	public boolean male; //default = false
	public int height; //default = zero
	public String type; //default =  null

	public Animal(boolean gender, int howTall, String kind) { //constructor - no void or any data types
		
		male = gender;
		height = howTall;
		type = kind;
		
		gender();
	}
	
	public void speak(String talk) { //method - void or data type if returning something
		System.out.println(talk);
	}
	
	public void gender() {
		if(male == true) { //male
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
	}
	 

	public static void main(String []args) { //where everything happens
		 Animal snake = new Animal(false, 45, "reptile");
		 snake.speak("sssssssssssssssss");
		 //snake.gender();
		// System.out.println(snake.type);
	}

}
