package java_oops;




class Parent1{
	  void marry()
	{
		System.out.println("black girl");
	}
}
public class Child1 extends Parent1 {

	 void marry()
	{
		System.out.println("red girl");
	}
	
	
	public static void main(String[] args) {
		Child1 test= new Child1();
		test.marry();
		//Parent1 t=new Child1();
		//t.marry();
	}

}
