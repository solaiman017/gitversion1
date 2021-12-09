package first_project;

public class Method_ex1 {
	
	public void m1(int a,int b){
	System.out.println(a+b);
	System.out.println(a);
	System.out.println(b);
	}
	public void m3(String y, char z){
	System.out.println(y);
	System.out.println(z);
	}
	public static void m2(double d, float c){
		System.out.println(d+c);
	}

	public static void main(String[] args) {
		Method_ex1 test= new Method_ex1();
		test.m1(10, 20);
		test.m2(10.2,20.2f);


	
	}

}
