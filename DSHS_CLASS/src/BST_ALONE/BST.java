package BST_ALONE;

import BinarySearchTree.Node;

public class BST {
	Node root;
	BST(){
		this.root = null;
	}
	
	boolean find(int data) {
		Node current = root;
		while(current!=null) {
			if(data > current.getData()) current = current.getRight();
			else if(data < current.getData()) current = current.getLeft();
			else if(data == current.getData()) return true;
		}
		return false;
	}
	
	void insert(int data) {
		Node current = root;
		Node parent = null;
		Node newNode = new Node(data);
		if(current ==  null) {
			root = newNode;
			return;
		}
		while(true) {
			parent = current;
			if(data > current.getData()) {
				current = current.getRight();
				if(current == null) {
					parent.setRight(newNode);
					return;
				}
			}
			else if(data < current.getData()) {
				current = current.getLeft();
				if(current == null) {
					parent.setLeft(newNode);
					return;
				}
			}
		}
	}
	
	boolean delete(int data) {
		Node current = root;
		Node parent = null;
		boolean isLeftChild = false;
		while(current.getData()!=data) {
			parent = current;
			if(data > current.getData()) {
				current = current.getRight();
				isLeftChild = false;
			}
			else if(data < current.getData()) {
				current = current.getLeft();
				isLeftChild = true;
			}
			if(current == null) return false;
		}
		
		if(current.getLeft() == null && current.getRight() == null) {
			if(current == root) {
				root = null;
			}
			else {
				if(isLeftChild) parent.setLeft(null);
				else parent.setRight(null);
			}
		}
		else if(current.getLeft() == null) {
			if(current == root) {
				root = current.getRight();
			}
			else {
				if(isLeftChild) parent.setLeft(current.getRight());
				else parent.setRight(current.getRight());
			}
		}
		else if(current.getRight() == null) {
			if(current == root) {
				root = current.getLeft();
			}
			else {
				if(isLeftChild) parent.setLeft(current.getLeft());
				else parent.setRight(current.getLeft());
			}
		}
		else if(current.getLeft() != null && current.getRight() != null) {
			Node successor = getsuccessor(current);
			if(current == root) {
				root = successor;
			}
			else {
				if(isLeftChild) {
					parent.setLeft(successor);
				}
				else {
					parent.setRight(successor);
				}
			}
			successor.setLeft(current.getLeft());
		}
		return true;
	}
	
	Node getsuccessor(Node deleteNode) {
		Node successor = deleteNode.getRight();
		Node current = successor;
		Node successorParent = deleteNode;
		
		while(current!=null) {
			successorParent = successor;
			successor = current;
			current = current.getLeft();
		}
		if(successor != deleteNode.getRight()) {
			successorParent.setLeft(successor.getRight());
			successor.setRight(deleteNode.getRight());
		}
		return successor;
	}
	public void display(Node root){
		if(root!=null){
			display(root.getLeft());
			System.out.print(" " + root.getData());
			display(root.getRight());
		}
	}
}
