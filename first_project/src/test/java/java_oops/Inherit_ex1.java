package java_oops;


class Sol{
	void m1(){
		System.out.println("m2 method");
	}
}

class Mud extends Sol
{
	void m2(){
		System.out.println("m3 method");
	}
}

class Mil extends Sol{
	void m4(){
		System.out.println("m4 method");
	}
}
public class Inherit_ex1 extends Mud{
	void m3(){
		System.out.println("m4 method");
	}
	

	public static void main(String[] args) {

		Inherit_ex1 t= new Inherit_ex1();
		Mil r=new Mil();
		r.m1();
t.m1();
t.m2();
t.m3();
	
	
		
		
		
	}

}
