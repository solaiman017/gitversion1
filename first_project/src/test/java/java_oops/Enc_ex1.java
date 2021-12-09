package java_oops;
// java ean class //vevo class
public class Enc_ex1 {
	private int eid;// instence variable
	private String ename;
	// setters are used to set the value

	public void setEid(int eid)//local variable 
	{     this.eid=eid;
		
	}
	public void setEname(String ename)
	{  
		this.ename=ename;
	}
	
	public int getEid(){
		return eid;
	}
	public String getEname(){
		return ename;
	}
	//getter are used to get the value from properties
	
	
	public static void main(String[] args) {
		Enc_ex1 test= new Enc_ex1();
		test.setEid(10);
		test.setEname("solaiman");
		
		//int eid = test.getEid();
		//System.out.println(eid);
		//String ename= test.getEname();
		//System.out.println(ename);
		System.out.println(test.getEid());
		System.out.println(test.getEname());
	}

}
