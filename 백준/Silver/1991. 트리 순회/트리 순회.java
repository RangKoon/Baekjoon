import java.util.*;
import java.io.*;

public class Main {
	public static void insertNode(Node node, char root, char left, char right) {
		if(node.vertex == root) {
			if(left == '.') {
				node.left = null;
			}
			else {
				node.left = new Node(left, null, null);
			}
			if(right == '.') {
				node.right = null;
			}
			else {
				node.right = new Node(right, null, null);
			}
		}
		
		else { // node.vertex != root
			if(node.left != null) {
				insertNode(node.left, root, left, right);
			}
			if(node.right != null) {
				insertNode(node.right, root, left, right);
			}
		}
		
	}
	
	public static void preOrder(Node node) {
		if(node == null) return;
		System.out.print(node.vertex);
		preOrder(node.left);
		preOrder(node.right);
	}
	public static void postOrder(Node node) {
		if(node==null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.vertex);
	}
	public static void inOrder(Node node) {
		if(node==null) return;
		inOrder(node.left);
		System.out.print(node.vertex);
		inOrder(node.right);
	}
	static class Node {
		char vertex;
		Node left;
		Node right;
		public Node(char vertex, Node left, Node right) {
			this.vertex = vertex;
			this.left = left;
			this.right = right;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	Node head = new Node('A', null, null);
    	for(int i=0; i<n; i++) {
    		String[] input = br.readLine().split(" ");
    		char root = input[0].charAt(0);
    		char left = input[1].charAt(0);
    		char right = input[2].charAt(0);
    		insertNode(head, root, left, right);
    	}
    	preOrder(head);
    	System.out.println();
    	inOrder(head);
    	System.out.println();
    	postOrder(head);
    	System.out.println();
    	
    	
    }
}   