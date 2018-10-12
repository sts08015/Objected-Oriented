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
		Node current = root;
		Node parent = null;
		Node insertNode = new Node(data,null,null);
		while(current!=null) {
			parent = current;
			if(current.key <data) current = current.right;
			else if(current.key >data) current = current.left;
		}
		if(current == root) root = insertNode;
		else if(parent.key > data) parent.left = insertNode;
		else parent.right = insertNode;
	}
	Node searchBST(Node root,int key) {
		if(root == null) return null;
		if(root.key > key) return searchBST(root.right,key);
		else if(root.key < key) return searchBST(root.left,key);
		else return root;
	}
	void deleteBST(int data) {
		Node current = root;
		boolean isLeftChild = false;
		Node parent = null;
		if(current == null) return;
		while(current.key != data) {
			parent = current;
			if(current.key>data) {
				current = current.right;
				isLeftChild = false;
			}
			else if(current.key<data) {
				current = current.left;
				isLeftChild = true;
			}
		}
		if(current.left !=null && current.right!=null) {
			Node successor = getSuccessor(current);
			if(current == root) {
				current = successor;
			}
			else if(isLeftChild) {
				parent.left = successor;
			}
			else if(!isLeftChild) {
				parent.right = successor;
			}
			successor.left = current.left;

		}
		else if(current.left == null && current.right == null) {
			if(current == root) {
				root = null;
			}
			else if(isLeftChild) {
				parent.left = null;
			}
			else if(!isLeftChild) {
				parent.right = null;
			}
		}
		else if(current.left != null) {
			if(current == root) {
				root = current.left;
			}
			else if(isLeftChild) {
				parent.left = current.left;
			}
			else if(!isLeftChild) {
				parent.right = current.left;
			}
		}
		else if(current.right != null) {
			if(current == root) {
				root = current.right;
			}
			else if(isLeftChild) {
				parent.left = current.right;
			}
			else if(!isLeftChild) {
				parent.right = current.right;
			}
		}
	}
	Node getSuccessor(Node deleteNode) {
		Node current = deleteNode.right;
		Node successor = current;
		//Node parent = deleteNode;
		Node successorParent = deleteNode;
		while(current!=null){
			successor = current;
			successorParent = current;
			current = current.left;
		}
		if(deleteNode.right != successor) {
			successorParent.left = successor.right;
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
