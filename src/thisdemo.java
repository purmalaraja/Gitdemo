
public class thisdemo {

	int a = 2;

	public void getdata() {
		
		int a=3;
		System.out.println(a);
		System.out.println(this.a);
		int sum =this.a+a;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisdemo td =new thisdemo();
				td.getdata();

	}

}
