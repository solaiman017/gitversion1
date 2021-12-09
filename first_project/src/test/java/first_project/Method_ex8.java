package first_project;

public class Method_ex8 {
	// to represent instence variable use this keyword
	int x=100;
	int y=200;
	void add(int x,int y)// local variable
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}

	public static void main(String[] args) {

		Method_ex8 test=new  Method_ex8();
		test.add(1000, 2000);
		
	}

}
