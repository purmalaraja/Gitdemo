
public class childdemo extends parentdemo{

	 // String name ="QAdemo";
	
	public childdemo() {
		super();//this should be in first in constructor
		System.out.println("am in child constructor");
	}
	public void getdata() {
		super.getdata();;
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("am in child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childdemo cd =new childdemo();
		cd.getdata();
	
	}

}
