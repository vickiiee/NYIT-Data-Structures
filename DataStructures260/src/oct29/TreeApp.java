package oct29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
	
class TreeApp {
	private static Tree theTree;
	private static int minimum;
	private static int max;
	private static int rightMinValue;
	private static int leftMaxValue;
	private static boolean dep;
	
	private static int getInt;
	
	public static void main(String[] args) throws IOException {
		int value;
		 theTree= new Tree();
		boolean start = true;
		//hw
		theTree.insert(7, 1.5);
		theTree.insert(5, 1.2);
		theTree.insert(1, 1.7);
		theTree.insert(8, 1.5);
		theTree.insert(3, 1.2);
		theTree.insert(6, 1.7);
		theTree.insert(0, 1.5);
		theTree.insert(9, 1.2);
		theTree.insert(4, 1.7);
		theTree.insert(2, 1.5);
		
		///////////////////////////////og
		/*theTree.insert(50, 1.5);
		theTree.insert(25, 1.2);
		theTree.insert(75, 1.7);
		theTree.insert(12, 1.5);
		theTree.insert(37, 1.2);
		theTree.insert(43, 1.7);
		theTree.insert(30, 1.5);
		theTree.insert(33, 1.2);
		theTree.insert(87, 1.7);
		theTree.insert(93, 1.5);
		theTree.insert(97, 1.5);*/

		while (start) {
			theTree.displayTree();
			System.out.println("Enter first letter of show, insert, find, delete, or traverse, OR");
			System.out.println("Enter z for size, p for depth, x for max, n for min, v for removeLeaves, r for rightMin, l for leftMinValue, q for quit");
			
			//si(z)e, de(p)th,
					//ma(x), mi(n), removelLea(v)es, (r)ightMin, (l)eftMinValue, (q)uit:
			int choice = getChar();
			switch (choice) {
			case 's':
				theTree.displayTree();
				break;
			case 'i':
				System.out.print("Enter value to insert: ");
				getInt();
				value = getInt;
				theTree.insert(value, value + 0.9);
				break;
			case 'f':
				System.out.print("Enter value to find: ");
				getInt();
				value = getInt;
				Node found = theTree.find(value);
				if (found != null) {
					System.out.print("Found: ");
					found.displayNode();
					System.out.print("\n");
				} else
					System.out.print("Could not find ");
				System.out.print(value + '\n');
				break;
			case 'd':
				System.out.print("Enter value to delete: ");
				getInt();
				value = getInt;
				boolean didDelete = theTree.delete(value);
				if (didDelete)
					System.out.print("Deleted " + value + '\n');
				else
					System.out.print("Could not delete \n");
				System.out.print(value + '\n');
				break;
			case 't':
				System.out.print("Enter type 1, 2 or 3: ");
				getInt();
				value = getInt;
				theTree.traverse(value);
				break;
			case 'z':
				//size(): total nodes in binary search tree
				System.out.println("There are "+size(theTree.getRoot())+ " nodes.\n");
				break;
			case 'p':
				//depth(key): height 
				dep = false;
				System.out.println("Which node do you want to find the depth of?");
				getInt();
				int nodeData = getInt;
				int depth = depth(nodeData);
				if(dep == false) {
					System.out.println("The node is not found.\n");
				}else {
					System.out.println("The node with key " + nodeData + " has depth "+ depth+"\n");
				}
				
				break;
			case 'x':
				//max: return max node
				max = theTree.getRoot().iData;
				System.out.print("Maximum: "+maximum(theTree.getRoot().rightChild)+"\n");
				break;
			case 'n':
				//min : return min mode
				 minimum = theTree.getRoot().iData;
				System.out.print("Minimum: "+minimum(theTree.getRoot().leftChild)+"\n");
				break;
			case 'v':
				//removeLeaves
				break;
			case 'r':
				//rightMin: minimum value of right subtree
				rightMinValue = theTree.getRoot().rightChild.iData;
				System.out.print("Right Minimum Value: "+rightMinValue(theTree.getRoot().rightChild)+"\n");
				break;
			case 'l':
				//leftMin: minimum vaue of left subtree
				leftMaxValue = theTree.getRoot().leftChild.iData;
				System.out.print("Left Maximum Value: "+leftMaxValue(theTree.getRoot().leftChild)+"\n");
				break;
			case 'q':
				//quit
				System.out.print("Quit");
				start = false;
				break;
			default:
				System.out.print("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()
// -------------------------------------------------------------
	public static int size(Node root)  
	{  //preorder
	    if (root == null)  
	        return 0;  
	    
	   // System.out.println("Node "+ root.iData);
	    return 1 +size(root.leftChild) +  size(root.rightChild);  
	} 
	
	public static int depth(int key) {
		//dep = true if key is found
		int edge = 0;
		
		Node current  = theTree.getRoot();
		
		while(current != null && current.iData != key) {
			System.out.println("data: " +current.iData);
			if(current.iData<key) {
				current = current.rightChild;
				edge++;
			}else {
				current = current.leftChild;
				edge++;
			}
		}
		
		if(current == null) {
			dep = false;
			return 0;
		}
		dep = true;
		return edge;
	}
	
	public static int minimum(Node rootLeftChild) {
		if(rootLeftChild != null) {
			//System.out.println("mini: "+minimum+ " data:"+rootLeftChild.iData );
			if(rootLeftChild.iData<minimum) {
				minimum = rootLeftChild.iData;
			}
			
			minimum(rootLeftChild.leftChild);
			minimum(rootLeftChild.rightChild);
		}
		return minimum;
	}
	
	public static int maximum(Node rootRightChild) {
		if(rootRightChild != null) {
			//System.out.println("mini: "+minimum+ " data:"+rootLeftChild.iData );
			if(rootRightChild.iData>max) {
				max = rootRightChild.iData;
			}
			
			maximum(rootRightChild.leftChild);
			maximum(rootRightChild.rightChild);
		}
		return max;
	}
	
	public static int rightMinValue(Node rootRightChild) {
		if(rootRightChild != null) {
			System.out.println("rughtmini: "+rightMinValue+ " data:"+rootRightChild.iData );
			if(rootRightChild.iData<rightMinValue) {
				rightMinValue = rootRightChild.iData;
			}
			
			rightMinValue(rootRightChild.leftChild);
			rightMinValue(rootRightChild.rightChild);
		}
		return rightMinValue;
	}
	
	public static int leftMaxValue(Node rootLeftChild) {
		if(rootLeftChild != null) {
			System.out.println("leftmax: "+leftMaxValue+ " data:"+rootLeftChild.iData );
			if(rootLeftChild.iData>leftMaxValue) {
				leftMaxValue = rootLeftChild.iData;
			}
			
			leftMaxValue(rootLeftChild.leftChild);
			leftMaxValue(rootLeftChild.rightChild);
		}
		return leftMaxValue;
	}
	
	
	//----------------------------------------------------------------------

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

// -------------------------------------------------------------
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

//-------------------------------------------------------------
	/*public static int getInt() throws NumberFormatException, IOException {
		/*og
		String s = getString();
		return Integer.parseInt(s);
		//
		
		String s = getString();
		try {
	        return Integer.parseInt(s);
	    }
	    catch (NumberFormatException e) {
	        // It's OK to ignore "e" here because returning a default value is the documented behaviour on invalid input.
	    	System.out.println("Please enter valid input (int)");
	        getInt();
	    }
		return getInt();
		
	}*/
public static void  getInt() throws NumberFormatException, IOException {
		/*og
		String s = getString();
		return Integer.parseInt(s);
		*/
		
		String s = getString();
		try {
	        getInt = Integer.parseInt(s);
	    }
	    catch (NumberFormatException e) {
	        // It's OK to ignore "e" here because returning a default value is the documented behaviour on invalid input.
	    	System.out.println("Please enter valid input (int)");
	        getInt();
	    }
		
}

// -------------------------------------------------------------
} // end class TreeApp
////////////////////////////////////////////////////////////////
