package oct29;
//Vickie Wu
//10/29/19
import java.io.IOException;
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
	/*	theTree.insert(50, 1.5);
		theTree.insert(25, 1.2);
		theTree.insert(75, 1.7);
		theTree.insert(12, 1.5);
		theTree.insert(37, 1.2);
		theTree.insert(43, 1.7);
		theTree.insert(30, 1.5);
		theTree.insert(33, 1.2);
		theTree.insert(7, 1.7);
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
					System.out.println("The node is not in tree.\n");
				}else {
					System.out.println("The node with key " + nodeData + " has depth "+ depth+"\n");
				}
				
				break;
			case 'x':
				//max: return max node
				if(theTree.getRoot() ==null) {
					System.out.println("No nodes in tree.");
				}else {
				max = theTree.getRoot().iData;
				System.out.print("Maximum: "+maximum(theTree.getRoot())+"\n");
				}
			
				break;
			case 'n':
				//min : return min mode
				if(theTree.getRoot() ==null) {
					System.out.println("No nodes in tree.");
				}else {
				 minimum = theTree.getRoot().iData;
				System.out.print("Minimum: "+minimum(theTree.getRoot())+"\n");
				}
				break;
			case 'v':
				//removeLeaves
				removeLeaves(theTree.getRoot());
				break;
			case 'r':
				//rightMin: minimum value of right subtree
				if(theTree.getRoot() ==null) {
					System.out.println("No nodes in tree.");
				}else if(theTree.getRoot().rightChild ==null) {
					System.out.println("No right subtree");
				}else {
				rightMinValue = theTree.getRoot().rightChild.iData;
				System.out.print("Right Minimum Value: "+rightMinValue(theTree.getRoot().rightChild)+"\n");}
				break;
			case 'l':
				//leftMin: minimum vaue of left subtree
				if(theTree.getRoot() ==null) {
					System.out.println("No nodes in tree.");
				}else if(theTree.getRoot().leftChild ==null) {
					System.out.println("No left subtree");
				}else {
				leftMaxValue = theTree.getRoot().leftChild.iData;
				System.out.print("Left Maximum Value: "+leftMaxValue(theTree.getRoot().leftChild)+"\n");
				}
				break;
			case 'q':
				//quit
				System.out.print("--------End--------");
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
	
	public static void removeLeaves(Node root) {
		Node current = root;
		if (current != null) {
			if(current.leftChild == null && current.rightChild == null) {
				theTree.delete(current.iData);
				
			}
			System.out.print(current.iData + " ");
			removeLeaves(current.leftChild);
			removeLeaves(current.rightChild);
		}
	}
	
	public static int minimum(Node rootLeftChild) {
		/*if(rootLeftChild != null) {
			//System.out.println("mini: "+minimum+ " data:"+rootLeftChild.iData );
			if(rootLeftChild.iData<minimum) {
				minimum = rootLeftChild.iData;
			}
			
			minimum(rootLeftChild.leftChild);
			minimum(rootLeftChild.rightChild);
		}
		return minimum;*/
		
		Node current  = rootLeftChild;
		while (current.leftChild!= null) {
			current = current.leftChild;
		}
		
		return current.iData;
	}
	
	public static int maximum(Node rootRightChild) {
		/*if(rootRightChild != null) {
			//System.out.println("mini: "+minimum+ " data:"+rootLeftChild.iData );
			if(rootRightChild.iData>max) {
				max = rootRightChild.iData;
			}
			
			maximum(rootRightChild.leftChild);
			maximum(rootRightChild.rightChild);
		}
		return max;*/
		
		Node current = theTree.getRoot(); //w/0 parameters
		System.out.println(current.iData);
		while(current.rightChild != null) {
			System.out.println(current.rightChild.iData);
			current = current.rightChild;
		}
		return current.iData;
	}
	
	public static int rightMinValue(Node rootRightChild) {
		/*if(rootRightChild != null) {
			System.out.println("rughtmini: "+rightMinValue+ " data:"+rootRightChild.iData );
			if(rootRightChild.iData<rightMinValue) {
				rightMinValue = rootRightChild.iData;
			}
			
			rightMinValue(rootRightChild.leftChild);
			rightMinValue(rootRightChild.rightChild);
		}
		return rightMinValue;*/
		
		//w/o parameters
		if(theTree.getRoot().rightChild == null) {
			//no right min vlue
		}
		Node current = theTree.getRoot().rightChild;
		while(current.leftChild!= null) {
			current = current.leftChild;
		}
		return current.iData;
	}
	
	public static int leftMaxValue(Node rootLeftChild) {
		/*if(rootLeftChild != null) {
			System.out.println("leftmax: "+leftMaxValue+ " data:"+rootLeftChild.iData );
			if(rootLeftChild.iData>leftMaxValue) {
				leftMaxValue = rootLeftChild.iData;
			}
			
			leftMaxValue(rootLeftChild.leftChild);
			leftMaxValue(rootLeftChild.rightChild);
		}
		return leftMaxValue;*/
		
		//w/o parameter
		
		Node current = theTree.getRoot().leftChild;
		while(current.rightChild!= null) {
			current = current.rightChild;
		}
		return current.iData;
	}
	
	
	//----------------------------------------------------------------------

	public static String getString() throws IOException {
		/*InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		if (s == "") {
			System.out.println("fhgfjhgkg");
		}
return s;*/
		

		String s = stringVal();
		while(s.isEmpty()) {
			System.out.println("Please enter valid input");
			s = stringVal();
		}
		return s;
	}
	
	public static String stringVal() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
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
