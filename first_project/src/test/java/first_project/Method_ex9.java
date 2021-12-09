package first_project;

public class Method_ex9 {
	//inside the static method this keyword not allowed
	int x=100;
	int y=200;
	static void add(int x,int y)// local variable
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}

	public static void main(String[] args) {

		Method_ex8 test=new  Method_ex8();
		test.add(1000, 2000);
		
	}


}
