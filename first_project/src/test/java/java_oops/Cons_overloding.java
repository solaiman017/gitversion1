package java_oops;

public class Cons_overloding {
	
	//over loaded contructor
	Cons_overloding(int a)
	{
		System.out.println("int arg cons");
	}
	
	Cons_overloding(int a,int b)
	{
		System.out.println("int, int cons");
	}
	
	Cons_overloding(char ch)
	{
		System.out.println("char cons");
	}
	

	public static void main(String[] args) {
	
		new Cons_overloding(10);
		new Cons_overloding(10,20);
		new Cons_overloding('a');
		
		System.out.println(10+20);
		System.out.println("murad"+"mahmudul");
	}

}
