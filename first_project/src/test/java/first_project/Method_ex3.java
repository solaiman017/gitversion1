package first_project;

class X{}
class Emp{}
class Y{}
class Student{}

public class Method_ex3 {

	void m1(X x,Emp e){
		System.out.println("m1 method");
	}
	
	static void m2(Y y,Student s){
		System.out.println("m2 method");
	}	
		
	public static void main(String[] args) {
		Method_ex3 test=new Method_ex3();
		
	X r=new X();
	Emp r2=new Emp();
	test.m1(r, r2);
	//test.m1(new X(), new Emp());
	Y r3=new Y();
	Student r4= new Student();
	Method_ex3.m2(r3, r4);
	//Method_ex3.m2(new Y(),new Student());

		
		

	}

}
