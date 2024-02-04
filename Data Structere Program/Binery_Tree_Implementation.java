package NON_Linear_DS;
import java.util.Scanner;

public class  Binery_Tree_Implementation{
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

	public static void main(String[] args) {
		Node root = Create();	 
	}
}


/* 
 package practice;
import java.util.*;

class BineryTree{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static Node create(){
		Scanner sc = new Scanner(System.in);
		Node root = null;
		System.out.print("Enter data: ");
		int data = sc.nextInt();
		if(data == -1) { // 
			return null;
		}
		root = new Node(data);
		System.out.println("if not want to add left child enter -1: ");
		System.out.println("Enter left child: "+root.data+" ");
		root.left = create();
		
		System.out.println("if not want to add right child enter -1: ");
		System.out.println("Enter right child: "+root.data+" ");
		return root;
	}
}

class Binery_Tree_Implementation{
	public static void main(String[] args) {
		BineryTree b1 = new BineryTree();
		practice.BineryTree.Node root = b1.create();
	}
}
 
 
 */
 