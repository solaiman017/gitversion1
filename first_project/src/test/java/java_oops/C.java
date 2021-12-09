package java_oops;


class A
{
	void m1()
	{
		System.out.println("m1 method");
	};
}

class B extends A
{
	void m2()
	{
		System.out.println("m2 method");
	}
}

public class C extends B {
	void m3()
	{
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		
		C obj= new C();
		obj.m1();
		obj.m2();
		obj.m3();
	}
	

}
