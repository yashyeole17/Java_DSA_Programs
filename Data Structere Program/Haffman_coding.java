package NON_Linear_DS;
import java.util.Comparator;
//import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Node{
	Character ch;
	Integer freq;
	Node left = null; 
	Node right = null;
	
	Node(Character ch, Integer freq){
		this.ch = ch;
		this.freq = freq;
	}
	
	public Node(Character ch, Integer freq, Node left, Node right) {
		this.ch = ch;
		this.freq = freq;
		this.left = left;
		this.right = right;
	}
}

public class Haffman_coding {
	
	public static void createHuffmanTree(String text) {
		if(text == null || text.length()==0) {
			return;
		}
		Map<Character, Integer> freq = new HashMap<>();
		for(char c: text.toCharArray()) {
			freq.put(c, freq.getOrDefault(c,0)+1);
		}
		
		PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(I->I.freq));
		for(var entry: freq.entrySet()) {
			pq.add(new Node(entry.getKey(), entry.getValue()));
		}
		
		while(pq.size() != 1) {
			Node left = pq.poll();
			Node right = pq.poll();
			
			int sum = left.freq + right.freq;
			pq.add(new Node(null, sum, left, right));
		}
		
		Node root= pq.peek();
		
		Map<Character, String> HuffmanCode = new HashMap<>();
		encodeData(root, "", HuffmanCode);
		
		System.out.println("Huffman codes of the character are: "+HuffmanCode);
		System.out.println("The initial String is: "+text);
		StringBuilder sb = new StringBuilder();
		
		for(char c: text.toCharArray()) {
			sb.append(HuffmanCode.get(c));
		}
		System.out.println("THe encoded string is: "+sb);
		System.out.print("The decoded string is: ");
		
		if(isLeaf(root)) {
			while(root.freq-->0) {
				System.out.print(root.ch);
			}
		}else {
			int index = -1;
			while(index < sb.length() -1) {
				index = decodeData(root, index, sb);
			}
		}
	} 
	
	private static void encodeData(Node root, String str, Map<Character, String> HuffmanCode) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		if(isLeaf(root)){
			HuffmanCode.put(root.ch, str.length() > 0? str:"1");
		}
		encodeData(root.left, str+'0', HuffmanCode);
		encodeData(root.right, str+'1', HuffmanCode);
	}
	
	private static int decodeData(Node root, int index, StringBuilder sb) {
		// TODO Auto-generated method stub
		if(root == null) {
			return index;
		}
		if(isLeaf(root)) {
			System.out.print(root.ch);
			return index;
		}
		index++;
		root = (sb.charAt(index) == '0')?root.left:root.right;
		index = decodeData(root, index, sb);
		return index;
	}

	public static boolean isLeaf(Node root) {
		// TODO Auto-generated method stub
		return root.left == null && root.right == null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "javatpoint";
		createHuffmanTree(text);
	}
}
