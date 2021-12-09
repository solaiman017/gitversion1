package first_project;

public class Method_ex11 {
	int m1(){
		System.out.println("m1 method");
		return 10;
	}
	float m2(){
		
		System.out.println("m2 method");
		return 10.5f;

	}
	static char m3()
	{
		System.out.println("m3 method");
		return 'a';
	}

	public static void main(String[] args) {
		Method_ex11 test=new Method_ex11();
		int x=test.m1();
		test.m1();
		float f=test.m2();
		
		char ch=Method_ex11.m3();
		
	}

}
