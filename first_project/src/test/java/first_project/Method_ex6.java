package first_project;

public class Method_ex6 {
	//method inside the method is call inner method in entire java inner methid concept is not allowed
	void m1(){
		System.out.println("m1 method");
		void m2(){
			System.out.println("m2 method");
		}
		
	}
	
	void m2(){
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		Method_ex6 test=new Method_ex6();
		test.m1();
		test.m2();
	}

}
