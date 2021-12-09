package first_project;

public class Method_ex7 {
	// method calling one method is able to calling multiple method at a time
	void m1(){
		m2();//instence method calling
		System.out.println("m1 method");
		m2();
	}

	void m2(){
		m3(10);
		System.out.println("m2 method");
	}
	void m3(int a){
		System.out.println("m3 method");
	}
	public static void main(String[] args) {

		Method_ex7 test=new Method_ex7();
		
		test.m1();
		
		
		
	}

}
