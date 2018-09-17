package BinarySearchTree;

public class BinarySearchTree {
	public Node root;
	public BinarySearchTree(){
		this.root = null;
	}
	//Ž�� ����
	public boolean find(int id){
		Node current = root;
		while(current!=null){
			//���� ���� ã�� ���� ������
			if(current.getData()==id){
				return true;
				//ã�� ���� ���� ��庸�� ������
			} else if(current.getData()>id){
				current = current.getLeft();
				//ã�� ���� ���� ��庸�� ũ��
			} else{
				current = current.getRight();
			}
		}
		return false;
	}
	//���� ����
	public boolean delete(int id){
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(current.getData()!=id){
			parent = current;
			if(current.getData()>id){
				isLeftChild = true;
				current = current.getLeft();
			}else{
				isLeftChild = false;
				current = current.getRight();
			}
			if(current==null){
				return false;
			}
		}
		//Case 1: �ڽĳ�尡 ���� ���
		if(current.getLeft()==null && current.getRight()==null){
			if(current==root){
				root = null;
			}
			if(isLeftChild==true){
				parent.setLeft(null);
			}else{
				parent.setRight(null);
			}
		}
		//Case 2 : �ϳ��� �ڽ��� ���� ���
		else if(current.getRight()==null){
			if(current==root){
				root = current.getLeft();
			}else if(isLeftChild){
				parent.setLeft(current.getLeft());
			}else{
				parent.setRight(current.getLeft());
			}
		} else if(current.getLeft()==null){
			if(current==root){
				root = current.getRight();
			}else if(isLeftChild){
				parent.setLeft(current.getRight());
			}else{
				parent.setRight(current.getRight());
			}
		}
		//Case 3 : �ΰ��� �ڽ��� ���� ���
		else if(current.getLeft()!=null && current.getRight()!=null){
			// ������ ����Ʈ���� �ּҰ��� ã��
			Node successor = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeftChild){
				parent.setLeft(successor);
			}else{
				parent.setRight(successor);
			}			
			successor.setLeft(current.getLeft());
		}		
		return true;		
	}

	public Node getSuccessor(Node deleleNode){
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.getRight();
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.getLeft();
		}
		if(successsor!=deleleNode.getRight()){
			successsorParent.setLeft(successsor.getRight());
			successsor.setRight(deleleNode.getRight());
		}
		return successsor;
	}

	//���� ����
	public void insert(int id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id < current.getData()){				
				current = current.getLeft();
				if(current==null){
					parent.setLeft(newNode);
					return;
				}
			}else{
				current = current.getRight();
				if(current==null){
					parent.setRight(newNode);
					return;
				}
			}
		}
	}
	
	public void display(Node root){
		if(root!=null){
			display(root.getLeft());
			System.out.print(" " + root.getData());
			display(root.getRight());
		}
	}
}
