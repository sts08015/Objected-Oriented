package Test;

public class vsPython {
	static int a = 0;
	int b = 0;
	
	vsPython(){
		vsPython.a+=1;
		b+=1;
	}
	public static void main(String[] args) {
		vsPython x = new vsPython();
		vsPython y = new vsPython();
		System.out.println(vsPython.a);
		System.out.printf("%d %d",x.b,y.b);
	}
}
