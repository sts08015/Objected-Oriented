package BinarySearch;

// 부모에 비해서 왼쪽 자식 작은값 오른쪽 자식 큰값
class Node {
	int key;
	Node left, right;

	public Node(int key, Node left, Node right) {
		this.left = left;
		this.right = right;
		this.key = key;
	}

	public Node() {

	}
}

public class BinarySearchTree {
	static void bsTree(Node root, int key) {
		if (root != null) {
			if (root.key == key) {
				System.out.printf("\n%d", key);
				System.out.print(" find complete");
			} else if (root.key < key)
				bsTree(root.right, key);
			else
				bsTree(root.left, key);
		}
		return;
	}

	static void insertBST(Node root, int key) {

		if (root != null) {
			if (root.key < key) {
				if (root.right == null) {
					Node x = new Node(key, null, null);
					root.right = x;
				} else
					insertBST(root.right, key);
			}
			if (root.key >= key) {
				if (root.left == null) {
					Node x = new Node(key, null, null);
					root.left = x;
				}

				else
					insertBST(root.left, key);
			}
		}

	}

	static void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.printf("%d ", root.key);
		inorder(root.right);
	}

	static void deleteBST(Node root, Node p, int key, boolean chk) {
		
	}
//	Node find(int key) {
//		
//	}
	public static void main(String[] args) {
		Node root = new Node(10, null, null);
		insertBST(root, 8);
		// insertBST(root, 6);
		// insertBST(root, 19);
		// insertBST(root, 18);
		// insertBST(root, 9);
		// insertBST(root, 2);
		inorder(root);

		int key = 8; // 찾을 키 값
		bsTree(root, key); // 찾았는지 확인

		key = 8;
		deleteBST(root, null, key, true);
		System.out.println();
		inorder(root);
	}

}