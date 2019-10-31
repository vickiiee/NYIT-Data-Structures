package oct29;

//Vickie Wu
//10/29/19
import java.io.IOException;
import java.util.Scanner;

//
class TreeApp {
	private static Tree theTree;
	private static boolean dep;
	private static int getInt;

	public static void main(String[] args) throws IOException {
		int value;
		theTree = new Tree();
		boolean start = true;
		
		theTree.insert(50, 1.5);
		theTree.insert(25, 1.2);
		theTree.insert(75, 1.7);
		theTree.insert(12, 1.5);
		theTree.insert(37, 1.2);
		theTree.insert(43, 1.7);
		theTree.insert(30, 1.5);
		theTree.insert(33, 1.2);
		theTree.insert(7, 1.7);
		theTree.insert(93, 1.5);
		theTree.insert(97, 1.5);

		while (start) {
			theTree.displayTree();
			System.out.println("Enter first letter of show, insert, find, delete, or traverse, OR");
			System.out.println("Enter z for size, p for depth, x for max, n for min, v for removeLeaves, \n	r for rightMinValue, l for leftMinValue, or q for quit");

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
			//--------my work--------------------------------------
			case 'z':
				// size(): total nodes in binary search tree
				System.out.println("There are " + size(theTree.getRoot()) + " nodes.\n");
				break;
			case 'p':
				// depth(key): height
				dep = false;
				System.out.println("Which node do you want to find the depth of?");
				getInt();
				int nodeData = getInt;
				int depth = depth(nodeData);
				if (dep == false) {
					System.out.println("The node is not in tree.\n");
				} else {
					System.out.println("The node with key " + nodeData + " has depth " + depth + "\n");
				}
				break;
			case 'x':
				// max: return max node
				if (theTree.getRoot() == null) {
					System.out.println("No nodes in tree.");
				} else {
					System.out.print("Maximum: " + maximum() + "\n");
				}
				break;
			case 'n':
				// min : return min mode
				if (theTree.getRoot() == null) {
					System.out.println("No nodes in tree.");
				} else {
					System.out.print("Minimum: " + minimum() + "\n");
				}
				break;
			case 'v':
				// removeLeaves void
				removeLeaves(theTree.getRoot());
				break;
			case 'r':
				// rightMin: minimum value of right subtree
				if (theTree.getRoot() == null) {
					System.out.println("No nodes in tree.");
				} else if (theTree.getRoot().rightChild == null) {
					System.out.println("No right subtree");
				} else {
					System.out.print("Right Minimum Value: " + rightMinValue(theTree.getRoot().rightChild) + "\n");
				}
				break;
			case 'l':
				// leftMin: maximum value of left subtree
				if (theTree.getRoot() == null) {
					System.out.println("No nodes in tree.");
				} else if (theTree.getRoot().leftChild == null) {
					System.out.println("No left subtree");
				} else {
					System.out.print("Left Maximum Value: " + leftMaxValue(theTree.getRoot().leftChild) + "\n");
				}
				break;
			case 'q':
				// quit
				System.out.print("--------End--------");
				start = false;
				break;
			default:
				System.out.print("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()
// -------------------------------------------------------------

	public static int size(Node root) {
		if (root == null)
			return 0;
		
		return 1 + size(root.leftChild) + size(root.rightChild);
	}

	public static int depth(int key) {
		// dep = true if key is found
		int edge = 0;

		Node current = theTree.getRoot();
		while (current != null && current.iData != key) {
			System.out.println("data: " + current.iData);
			if (current.iData < key) {
				current = current.rightChild;
				edge++;
			} else {
				current = current.leftChild;
				edge++;
			}
		}
		if (current == null) {
			dep = false;
			return 0;
		}
		dep = true;
		return edge;
	}

	public static void removeLeaves(Node root) {
		Node current = root;
		if (current != null) {
			if (current.leftChild == null && current.rightChild == null) {
				theTree.delete(current.iData);
			}
			System.out.print(current.iData + " ");
			removeLeaves(current.leftChild);
			removeLeaves(current.rightChild);
		}
	}

	public static int minimum() {
		Node current = theTree.getRoot();
		while (current.leftChild != null) {
			current = current.leftChild;
		}
		return current.iData;
	}

	public static int maximum() {
		Node current = theTree.getRoot(); 
		while (current.rightChild != null) {
			current = current.rightChild;
		}
		return current.iData;
	}

	public static int rightMinValue(Node rootRightChild) {
		Node current = theTree.getRoot().rightChild;
		while (current.leftChild != null) {
			current = current.leftChild;
		}
		return current.iData;
	}

	public static int leftMaxValue(Node rootLeftChild) {
		Node current = theTree.getRoot().leftChild;
		while (current.rightChild != null) {
			current = current.rightChild;
		}
		return current.iData;
	}

	// ----------------------------------------------------------------------
	public static String getString() throws IOException {
		String s = stringVal();
		while (s.isEmpty()) {
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
	public static void getInt() throws NumberFormatException, IOException {
		String s = getString();
		try {
			getInt = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Please enter valid input (int)");
			getInt();
		}

	}

// -------------------------------------------------------------
} // end class TreeApp
////////////////////////////////////////////////////////////////
