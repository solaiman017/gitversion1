package java_oops;

public class Poly {
	//method overloading
	void m1(int a)
	{
		System.out.println("int m1 method");
	}
	
	void m1(int a,int b)
	{
		System.out.println("int, int m1 method");
	}
	
	void m1(char ch)
	{
		System.out.println("char m1 method");
	}
	

	public static void main(String[] args) {
		Poly t = new Poly();
         t.m1(10);
         t.m1(10, 20);
         t.m1('a');
	}

}
