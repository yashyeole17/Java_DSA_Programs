package NON_Linear_DS;
import java.util.*;

import NON_Linear_DS.Binery_Tree_Implementation.Node;

		// inorder :  left-root-right 
		// preorder:  root-left-right
		// postorder: left-right-root

public class  tree_traversal_algorithm_bineryTree{
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	static Node Create() {
		Scanner sc = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter data: ");
		int data = sc.nextInt();
		
		if(data == -1) 			//base condition
			return null;
		root = new Node(data);
		System.out.println("if not want to add left child enter -1");
		System.out.println("Enter left child of "+root.data+" : ");
		root.left = Create();
		
		System.out.println("if not want add to right child enter -1");
		System.out.println("Enter right child of "+root.data+" : ");
		root.right = Create();
		
		return root;
	}
	
	public static void inorder(Node root) {  // left-root-right
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void preorder(Node root) {	// root-left-right
		if(root == null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void postorder(Node root) {	// left-root-right
		if(root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}

	public static void main(String[] args) {
		Node root = Create();	
		System.out.println();
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
	}
}