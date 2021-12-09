package first_project;

class Parant{
	Parant(){
		System.out.println("parent class 0 argument cons");
	}
}
public class Con_ex extends  Parant{
	
	Con_ex(){
		this(10);
		System.out.println("child class 0 argument cons");
	}
	
	Con_ex(int a ){
		super();
		System.out.println("child class 1 argument cons");
	}
	public static void main(String[] args) {
		Con_ex test= new Con_ex();
		//Parant t=new Parant();
	}
}
