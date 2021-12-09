package java_oops;


class parent{
void m1(){
System.out.println("parent m1 method");
         }
}

public class Child extends parent{
	
	void m1()
	{
		System.out.println("child m1 method");
	}
	void m2(){
		this.m1();
		super.m1();
	}
	public static void main(String[] args) {
	
        //new Child().add(100, 200);
        Child obj=new Child();
        obj.m2();
	}
}
