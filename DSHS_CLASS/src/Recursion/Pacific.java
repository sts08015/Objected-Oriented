package Recursion;

class Node {

	char name;
	Node left;
	Node right;

	Node(char name,Node left,Node right){
		this.name = name;
		this.left = left;
		this.right = right;
	}

}

public class Pacific {
	public static void Acourse(Node n) {
		if(n == null) return;
		System.out.println(n.name);
		Acourse(n.left);
		Acourse(n.right);
	}
	public static void Bcourse(Node n) {
		if(n == null) return;
		Bcourse(n.left);
		System.out.println(n.name);
		Bcourse(n.right);
	}
	public static void Ccourse(Node n) {
		if(n == null) return;
		Ccourse(n.left);
		Ccourse(n.right);
		System.out.println(n.name);
	}
	public static void main(String[] args) {
		Node H = new Node('H',null,null);
		Node F = new Node('F',null,null);
		Node U = new Node('U',null,null);
		Node N = new Node('N',null,null);
		Node E = new Node('E',null,null);
		Node A = new Node('A',null,null);
		Node T = new Node('T',null,null);
		Node S = new Node('S',null,null);
		Node Z = new Node('Z',null,null);
		Node K = new Node('K',null,null);
		Node Y = new Node('Y',null,null);
		H.left = F;
		H.right = S;
		F.left = U;
		F.right = E;
		U.left = N;
		E.left = A;
		A.right = T;
		S.left = Z;
		S.right = K;
		K.right = Y;;
		
		Acourse(H);
		System.out.println("------------------");
		Bcourse(H);
		System.out.println("------------------");
		Ccourse(H);
	}

}
