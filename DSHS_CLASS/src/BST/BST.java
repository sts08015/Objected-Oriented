package BST;

import BinarySearchTree.Node;

public class BST {
	Node root;
	public BST() {
		this.root = null;
	}

	public boolean find(int data) {
		Node current = root;
		while(current!=null) {
			if(data < current.getData()) {
				current = current.getLeft();
			}
			else if(data > current.getData()) {
				current = current.getRight();
			}
			else return true;
		}
		return false;
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(current!=null) {
			parent = current;
			if(data < current.getData()) {
				current = current.getLeft();
				if(current == null) {
					parent.setLeft(newNode);
					return;
				}
			}
			else if(data > current.getData()) {
				current = current.getRight();
				if(current == null) {
					parent.setRight(newNode);
					return;
				}
			}
		}
		
	}
	
	public boolean delete(int data) {
		Node current = root;
		Node parent = null;
		boolean isLeftChild = false;
		while(current.getData() != data) {
			parent = current;
			
			if(current.getData() > data) {
				current = current.getLeft();
				isLeftChild = true;
			}
			else if(current.getData() < data) {
				current = current.getRight();
				isLeftChild = false;
			}
			if(current == null) {
				return false;
			}
		}
		
		if(current.getLeft()==null && current.getRight() == null) {
			if(current == root) {
				root = null;
			}
			else if(isLeftChild == true) {
				parent.setLeft(null);
			}
			else {
				parent.setRight(null);
			}
		}
		
		else if(current.getLeft() == null) {
			if(current == root) {
				root = current.getRight();
			}
			else if(isLeftChild == true) {
				parent.setLeft(current.getRight());
			}
			else if(isLeftChild == false) {
				parent.setRight(current.getRight());
			}
		}
		else if(current.getRight() == null) {
			if(current == root) {
				root = current.getLeft();
			}
			else if(isLeftChild == true) {
				parent.setLeft(current.getLeft());
			}
			else if(isLeftChild == false) {
				parent.setRight(current.getLeft());
			}
		}
		
		else if(current.getLeft()==null && current.getRight()==null) {
			Node successor = getsuccessor(current);
			if(current == root) {
				root = successor;
			}
			else if(isLeftChild) {
				parent.setLeft(successor);
			}
			else if(!isLeftChild) {
				parent.setRight(successor);
			}
			successor.setLeft(current.getLeft());
		}
		return true;
	}
	public Node getsuccessor(Node deleteNode) {
		Node successor = deleteNode.getRight();
		Node successorParent = deleteNode;
		Node current = successor;
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.getLeft();
		}
		if(deleteNode.getRight()!=successor) {
			successor.setRight(deleteNode.getRight());
			successorParent.setLeft(successor.getRight());
		}
		return successor;
	}
}
