package oct24;

public class Notes {
/*CH8:
 * 
 * Binary Trees:
 * 		Use it because it combines the advantages of an ordered array and linked list
 * 
 * What is a tree?
 * 	COnsists of nodes and ......
 * 	
 * 	tree terminology:
 * 		ROOT: the node at the top of the tree is called the root. ONLY ONE ROOT IN TREE
 * 		PATH: think of someone walking from node to node along the edges ..... check out zybooks....
 * 		PARENT:
 * 		CHILD:
 * 		VISITING:
 * 		TRAVERSING:
 * 		LEVELS:
 * 		KEYS:
 * 
 *  BINARY TREE: EVERY NODE CAN HAVE AT MOST 2 CHILDRN!
 *  		A NODES LEFT CHILD MUST HAVE A KEY LESS THAN ITS PARENT
 *  		A NODES RIGHT MUST HAVE A KEY REATER THAN OR EQUAL TO ITS PARENT
 *  
 *  BST: check out slides
 *  
 *  UNBLANCED: TREE THAT HAVE MOST OF THEIR NODES ON ONE SIDE OF THE ROOT OR THE OTHER
 *  
 *  
 *  Binary Tree : Time efficiency: O(logN)
 *  
 *  Insertion: insert value by comparing values in left/right
 *  
 *  Traversals:
				INORDER traversal of a binary search tree will cause all the nodes to
					be visited in ascending order, based on their key values. If you want
					to create a sorted list of the data in a binary tree, this is one way to
					do it.
					***Zybooks: LEFT, CURRENT, RIGHT AND REPEAT!
					*
https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/					

Algorithm Inorder(tree)
   1. Traverse the left subtree, i.e., call Inorder(left-subtree)
   2. Visit the root.
   3. Traverse the right subtree, i.e., call Inorder(right-subtree)
   
   Algorithm Preorder(tree)
   1. Visit the root.
   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
   3. Traverse the right subtree, i.e., call Preorder(right-subtree) 
   
   Algorithm Postorder(tree)
   1. Traverse the left subtree, i.e., call Postorder(left-subtree)
   2. Traverse the right subtree, i.e., call Postorder(right-subtree)
   3. Visit the root.
 *  
 *  
 */
}
