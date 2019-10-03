package oct01;

//Vickie Wu
//10/01/19

public class Exercises {
	
	public Exercises() {
	}
	
	public static void main(String[] args) {
		Exercises test1 = new Exercises();
		StackX stack1 = new StackX(100);
		Queue q1 = new Queue(20); 
		
		System.out.println("Stack:");
		System.out.println("RemoveDownTo(x):");
		System.out.println("top -> bottom");
		
		stack1.push(10);
		//System.out.println("Pushed: "+stack1.peek());
		stack1.push(20);
		//System.out.println("Pushed: "+stack1.peek());
		stack1.push(30);
		//System.out.println("Pushed: "+stack1.peek());
		stack1.push(40); 
		//System.out.println("Pushed: "+stack1.peek());
		stack1.push(50); 
		stack1.push(60); 
		stack1.push(70);
		stack1.push(80); 
		stack1.push(90); 
		stack1.push(100); 
		//top - bottom

		System.out.print("Result: ");
		test1.removeDownTo(stack1, 60);
		test1.displayStack(stack1);
		
		//---------------QUEUE-------------------------------------
		System.out.println("\n\nQueue:");
		System.out.println("RemoveSecond():");
		System.out.println("beginning -> end");
		
		q1.insert(10);
		q1.insert(20); //remove this element
		q1.insert(30);
		q1.insert(40);
		q1.insert(50);
		q1.insert(60);
		q1.insert(70);
		q1.insert(80);
		q1.insert(90);
		q1.insert(100);
	
		System.out.print("Result: ");
		test1.removeSecond(q1);
		test1.displayQueue(q1);
	}
	
	
	//------------Exercise 3----------------------
	public void removeDownTo(StackX stack, long n) {
		while(!stack.isEmpty()) {
			long ele = stack.peek();
			
			if(ele != n) {
				stack.pop();
			}else {
				return;
			}	
		}
		
		System.out.println("Cannot find value. Stack is now empty");
	}
	
	//------------Exercise 4----------------------
	public Object removeSecond(Queue queue) {
		Object ele = null;
		if(queue.size()<2) {
			System.out.println("Queue must have at least 2 elements");
		}else {
			for(int i = 0; i<= queue.size(); i++) {
				if(i == 1) {
					ele= queue.remove();
				}else {
					Object temp = queue.remove();
					queue.insert((long)temp);
				}
			}
		}
		return ele;
		
	}
	
	public void displayStack(StackX theStack) {
		while (!theStack.isEmpty()) { // until it's empty,
			// delete item from stack
			long value = theStack.pop();
			
			System.out.print(value); // display it
			System.out.print(" ");
		} // end while
	}
	
	public void displayQueue(Queue theQueue) {
		while (!theQueue.isEmpty()) // remove and display
		{ // all items
			long n = theQueue.remove(); // (40, 50, 60, 70, 80)
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
