package java_oops;
class Animal{}
class Dog extends Animal{}

class Par{
	 Animal marry()
	{
		System.out.println("black girl");
		Animal d=new Animal();
		return d;
	}
}
	
class Bar extends Par{
	Dog marry()
	{
		System.out.println("red girl");
		return new Dog();
	}
}
public class Polyex1{

	public static void main(String[] args) {
		
		Bar test= new Bar();
		test.marry();
}
}