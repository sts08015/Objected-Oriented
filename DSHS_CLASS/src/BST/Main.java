package BST;

public class Main {
	public static void main(String[] args) {
		BST b = new BST();
		//Ʈ���� ��带 ����
		b.insert(3);b.insert(8);
		b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
		b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		
		System.out.println("Ʈ������ ��� : ");
		b.display(b.root);
		System.out.println("");
		System.out.println("����Ʈ������ 4�� Ž�� : " + b.find(4));
		System.out.println("����Ʈ������ 3�� ���� : " + b.delete(3));		
		b.display(b.root);
		System.out.println("\n����Ʈ������ 4�� ���� : " + b.delete(4));		
		b.display(b.root);
		System.out.println("\n����Ʈ������ 10�� ���� : " + b.delete(10));		
		b.display(b.root);
}
}

