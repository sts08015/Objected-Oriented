package bst_wjdckdgns;

class Node {
    int key;
    Node left;
    Node right;
    Node (int k, Node l, Node r) {
        key = k;
        left = l;
        right = r;
    }
}

class BST {
    Node root;

    BST(Node r) {
        root = r;
    }

    Node searchBST(Node root,int key) {
    	if(root == null) return null;
    	if(root.key == key) return root;
    	else if(root.key < key) return searchBST(root.right,key);
    	else return searchBST(root.left,key);
    }

    void insertBST(Node r,int key) {
    	Node p = null;
    	Node t = r;
    	Node newNode = new Node(key,null,null);
    	
    	while(t!=null){
    		p = t;
    		if(t.key < key) t = t.right;
    		else t = t.left;
    	}
    	if(p == null) root = newNode;
    	else if(p.key > key) p.left = newNode;
    	else p.right = newNode;
    }
    boolean deleteNode(int key) {
    	Node current = root;
    	Node parent = null;
    	boolean isLeftChild = false;
    	if(current == null) return false;
    	while(current.key != key) {
    		parent = current;
    		if(current.key<key) {
    			current = current.left;
    			isLeftChild = true;
    		}
    		else {
    			 current = current.right;
    			 isLeftChild = false;
    		}
    	}
    	if(current.left == null && current.right == null) {
    		if(current == root) root = null;
    		else if(isLeftChild) parent.left = current;
    		else if(!isLeftChild) parent.right = current;
    	}
    	else if(current.left == null) {
    		if(current == root) root = current.right;
    		else if(isLeftChild) parent.left = current.right;
    		else if(!isLeftChild) parent.right = current.right;
    	}
    	else if(current.right == null) {
    		if(current == root) root = current.left;
    		else if(isLeftChild) parent.left = current.left;
    		else if(!isLeftChild) parent.right = current.left;
    	}
    	else if(current.right != null && current.left != null) {
    		Node successor = getSuccessor(current);
    		if(current == root) root = successor;
    		else if(isLeftChild) parent.left = successor;
    		else if(!isLeftChild) parent.right = successor;
    		successor.left = current.left;
    	}
    	return true;
    }
    
    Node getSuccessor(Node deleteNode) {
    	Node current = deleteNode.right;
    	Node successor = current;
    	Node successorparent = deleteNode;
    	while(current != null) {
    		successorparent = successor;
    		successor = current;
    		current = current.left;
    	}
    	if(successor!=deleteNode.right) {
    		successorparent.left = successor.right;
    		successor.right = deleteNode.right;
    	}
    	return successor;
    }
    void display(Node root) {
    	if(root == null) return;
    	display(root.left);
    	System.out.println(root.key);
    	display(root.right);
    }
}

public class Main {
	public static void main(String[] args) {
		        int[] x = {8, 3, 10, 1, 6, 14, 4, 7, 13};

		        BST bst = new BST(null);

		        for (int i = 0; i<x.length; i++) {
		            bst.insertBST(bst.root, x[i]);
		        }
		        System.out.println((bst.searchBST(bst.root, 14)).key);
		        bst.deleteNode(10);
	}
}
