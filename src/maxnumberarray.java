
public class maxnumberarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int a[][]= {{2,4,5},{3,4,7},{1,2,9}};
		 int max=a[0][0];
		  for(int i=0;i<3;i++) {
			  
			  for(int j=0;j<3;j++) {
				  if(a[i][j]>max) {
					  
					  max=a[i][j];
				  }
			  }
			  
		  }
		  System.out.println(max); 
	}

}
