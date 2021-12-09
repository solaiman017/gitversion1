package java_oops;



abstract class Abs_con1{
	
	{
		System.out.println("hello");
	}
	static 
	{
		System.out.println("static block");
	}
	Abs_con1()
	{
		System.out.println("constractor");
	}
	
}
class Abs_con extends Abs_con1 {
	
	void ma(){
		System.out.println("m1 method");
		}
	
	Abs_con()
	{
		super();
		System.out.println("con 1");
	}

	public static void main(String[] args) {
		Abs_con test=new Abs_con();
		test.ma();
	}

}
