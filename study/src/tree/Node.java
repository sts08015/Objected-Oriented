package tree;

public class Node {
	public char name;
	public Node left,right;
	
	public Node(char name,Node left,Node right) {
		this.name = name;
		this.left = left;
		this.right = right;
	}
}
