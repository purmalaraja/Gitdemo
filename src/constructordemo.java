
public class constructordemo {

	public constructordemo() {
		System.out.println("am in constructor");
	}

	public constructordemo(int a,int b) {
	
		System.out.println(a);
	}

	public void getmethod() {
		System.out.println("am in method");
	}

	public static void main(String[] args) {
		constructordemo cd = new constructordemo();
		constructordemo cd1 = new constructordemo(2,3);
		cd.getmethod();

	}

}
