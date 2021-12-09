package java_oops;


abstract class Test{
	abstract public void m1();
	abstract public void m2();
	abstract public void m3();
	public void m4(){
		System.out.println("m4 method");
	}
}
public class Abs_ex1 extends Test {

	public void m1(){System.out.println("m1 method");}
	public void m2(){System.out.println("m2 method");}
	public void m3(){System.out.println("m3 method");}
public static void main(String[] args) {
	Abs_ex1 t= new Abs_ex1();
	t.m1();
	Test te= new Abs_ex1();
	te.m1();
	te.m2();
	te.m3();
	te.m4();
	t.m2();
	t.m3();
	t.m4();

	}

}
