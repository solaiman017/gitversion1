package java_oops;

public class Poly_ex1 {
	
	
	
	void m1(int a){
		System.out.println("int a method");
	}
	void m1(int a,int b){
		System.out.println("int a int a method ");
	}
	void m1(char ch){
		System.out.println("character method");
	}

	public static void main(String[] args) {

		Poly_ex1 test= new Poly_ex1();
		test.m1('h');
		test.m1(10);
		test.m1(20, 30);
		
		
		
	}

}
