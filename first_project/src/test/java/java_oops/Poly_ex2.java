package java_oops;

public class Poly_ex2 {

	
Poly_ex2(int a)
{
	System.out.println("int arg cons");
}
Poly_ex2(int a,int b)
{
	System.out.println("int,int argcons");	
}
Poly_ex2(char ch)
{
	System.out.println("character arg cons");
}
		
	public static void main(String[] args) {
			new Poly_ex2(10);
			new Poly_ex2(20,30);
			new Poly_ex2('g');

	}

}
