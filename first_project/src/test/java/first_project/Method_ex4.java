package first_project;

public class Method_ex4 {
	
	// two method different signature is possible
	void m2(int a){
		System.out.println("m2 method");
	}
	
	void m2(){
		System.out.println("m3 method");
	}
	
	
	
	
	


	public static void main(String[] args) {
		Method_ex4 test= new Method_ex4();
		test.m1();
		test.m2(10);
		test.m2();
		
			
		
		
	}
	// two method with the same signature are not allow
	void m1(){
		System.out.println("m1 method");
	}
	
	void m1(){
		System.out.println("m2 method");
	}	
}
