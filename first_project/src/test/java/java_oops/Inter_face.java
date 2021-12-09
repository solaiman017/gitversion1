package java_oops;


interface It1   //abstract
{
	void m1();   // public abstract
	void m2();
	void m3();
}

public class Inter_face {
	
	public void m1(){System.out.println("m1 method");}   // public abstract
	public void m2(){System.out.println("m2 method");}
	public void m3(){System.out.println("m3 method");};
	
	public static void main(String[] args) {
		Inter_face t= new Inter_face();
		t.m1();
		t.m2();
		t.m3();
	}
}
