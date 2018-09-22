package BST_AGAIN;

public class BST {
	Node root;
	BST(){
		this.root = null;
	}
	void insert(int data) {
		Node newNode = new Node(data);
		Node current = root;
		Node parent = null;
		
		if(current == null) {
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
	boolean find(int data) {
		Node current = root;
	
		while(current!=null) {
			if(current.getData() > data) {
				current = current.getLeft();
			}
			else if(current.getData() < data) {
				current = current.getRight();
			}
			
			else return true;
		}
		
		return false;
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
			
			if(current == null) {
				return false;
			}
		}
		
		if(current.getLeft() == null && current.getRight() == null) {
			if(current == root) {
				root = null;
			}
			else if(isLeftChild) {
				parent.setLeft(null);
			}
			else if(!isLeftChild) {
				parent.setRight(null);
			}
		}
		else if(current.getLeft()!=null) {
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
		else if(current.getRight() != null) {
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
		else if(current.getLeft()!=null && current.getRight()!=null) {
			Node successor = getSuccessor(current);
			if(current == root) {
				root = successor;
			}
			else if(isLeftChild){
				parent.setLeft(successor);
			}
			else if(!isLeftChild) {
				parent.setRight(successor);
			}
			successor.setLeft(current.getLeft());
		}
		return true;
	}
	
	Node getSuccessor(Node deleteNode) {
		Node successor = deleteNode.getRight();
		Node successorparent = null;
		Node current = deleteNode.getRight();
		while(current!=null) {
			successorparent = successor;
			successor = current;
			current = current.getLeft();
		}
		if(successor != deleteNode.getRight()) {
			successorparent.setLeft(successor.getRight());
			successor.setRight(deleteNode.getRight());
		}
		return successor;
	}
}
