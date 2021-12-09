package first_project;

public class Method_concept {
	
	
	
	public void m1(){
	System.out.println("m1 methood");
	}

	public static void m2(){
		System.out.println("m2 method");
	}
	public int m3(){
		
		System.out.println(10);
		return 10;
	}

	public static void main(String[] args) {
	
		Method_concept m= new Method_concept();
		m.m1();
		Method_concept.m2();
		m.m3();
		
	}

}
