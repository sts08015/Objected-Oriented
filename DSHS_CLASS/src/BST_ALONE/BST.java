package BST_ALONE;

import BinarySearchTree.Node;

public class BST {
	Node root;
	BST(){
		this.root = null;
	}
	
	void insert(int id) {
		Node newNode = new Node(id);
		if(root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true) {
			parent = current;
			if(current.getData() > id) {
				current = current.getLeft();
				if(current == null) {
					parent.setLeft(newNode);
					return;
				}
			}
			else if(current.getData() < id) {
				current = current.getRight();
				if(current == null) {
					parent.setRight(newNode);
					return;
				}
			}
		}
	}
	
	boolean find(int id) {
		Node current = root;
		while(current!=null) {
			if(current.getData() > id) {
				current = current.getLeft();
			}
			else if(current.getData() < id) {
				current = current.getRight();
			}
			if(current.getData() == id) return true;
		}
		return false;
	}
	
	boolean delete(int id) {
		Node current = root;
		Node parent = null;
		boolean isLeftChild = false;
		while(current.getData()!=id) {
			parent = current;
			if(current.getData() > id) {
				current = current.getLeft();
				isLeftChild = true;
			}
			else if(current.getData() < id) {
				current = current.getRight();
				isLeftChild = false;
			}
			if(current == null) return false;
		}
		
		if(current.getLeft()==null && current.getRight() == null) {
			if(current == root) {
				root = null;
			}
			else if(isLeftChild){
				parent.setLeft(null);
			}
			else if(!isLeftChild) {
				parent.setRight(null);
			}
		}
		
		else if(current.getLeft() == null) {
			if(current == root) {
				root = current.getRight();
			}
			else if(isLeftChild) {
				parent.setLeft(current.getRight());
			}
			else if(!isLeftChild) {
				parent.setRight(current.getRight());
			}
		}
		else if(current.getRight() == null) {
			if(current == root) {
				root = current.getLeft();
			}
			else if(isLeftChild) {
				parent.setLeft(current.getLeft());
			}
			else if(!isLeftChild) {
				parent.setRight(current.getLeft());
			}
		}
		else if(current.getLeft() == null && current.getRight() == null) {
			Node successor = findsuccessor(current);
			if(root == current) {
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
	Node findsuccessor(Node deleteNode) {
		Node successor = deleteNode.getRight();
		Node successorParent = deleteNode;
		Node current = successor;
		
		while(current!=null) {
			successorParent = successor;
			successor = current;
			current = current.getLeft();
		}
		if(deleteNode.getRight() != successor) {
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
