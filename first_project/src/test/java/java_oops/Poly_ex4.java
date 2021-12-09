package java_oops;


class Parent{
	void marry()
	{
		System.out.println("black girl");
	}
}
class Ch extends Parent {
	
	void marry()
	{
		System.out.println("red girl");
	}
}



public class Poly_ex4 {
	
	

	public static void main(String[] args) {
		Ch t=new Ch();
		t.marry();
		
		
		
	}

}
