package bst_wjdckdgns;

class Node{
	Node left;
	Node right;
	int key;
	Node(int key,Node left,Node right){
		this.key = key;
		this.left = left;
		this.right = right;
	}
}
class BST{
	Node root;
	BST(Node root){
		this.root = root;
	}
	void insertBST(Node root,int data) {
		Node parent = null;
		Node current = root;
		Node insertNode = new Node(data,null,null);
		while(current!=null) {
			parent = current;
			if(current.key > data) current = current.left;
			else current = current.right;
		}
		if(current == root) root = insertNode;
		else if(parent.key > data) parent.left = insertNode;
		else parent.right = insertNode;
	}
	Node searchBST(Node root,int data) {
		if(root == null) return null;
		if(root.key == data) return root;
		else if(root.key > data) return searchBST(root.left,data);
		else return searchBST(root.right,data);
	}
	boolean deleteBST(int data) {
		Node current = root;
		Node parent = null;
		boolean isLeftChild = false;
		if(current == null) return false;
		while(current.key != data) {
			parent = current;
			if(current.key>data) {
				current = current.left;
				isLeftChild = true;
			}
			else {
				current = current.right;
				isLeftChild = false;
			}
		}
		Node successor = getsuccessor(current);
		if(current == root) root = successor;
		else if(isLeftChild) parent.left = successor;
		else if(!isLeftChild) parent.right = successor;
		successor.left = current.left;
		return true;
	}
	Node getsuccessor(Node deleteNode) {
		Node current = deleteNode.right;
		Node successor = current;
		Node successorparent = deleteNode;
		
		while(current!=null) {
			successorparent = successor;
			successor = current;
			current = current.left;
		}
		if(deleteNode.right != current) {
			successorparent.left = successor.right;
			successor.right = deleteNode.right;
		}
		
		return successor;
	}
}

public class Main {
	public static void main(String[] args) {
		        int[] x = {8, 3, 10, 1, 6, 14, 4, 7, 13};

		        BST bst = new BST(null);
		        
		        for (int i = 0; i<x.length; i++) {
		            bst.insertBST(bst.root, x[i]);
		        }
		        //System.out.println((bst.searchBST(bst.root, 14)).key);
		        bst.deleteBST(10);
	}
}
