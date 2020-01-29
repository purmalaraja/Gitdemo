package collections;

import java.util.ArrayList;

public class collectiondemo {

	public static void main(String[] args) {
		int a[]= {3,3,3,4,4,4,5,5,6,6,6,2,2,2,9,};
		
		ArrayList<Integer> ab =new ArrayList<Integer>();
		for(int i=0;i <a.length; i++) {
			int k=0;
			if(!ab.contains(a[i])) {
				
				ab.add(a[i]);
				k++;
				for(int j=1+i; j<a.length;j++) {
					
					if(a[i]== a[j]) {
						
						k++;
					}
				}
				/*System.out.println(a[i]);
				System.out.println(k);*/
				if(k==1) {
					System.out.println(a[i] + "is unique no");
				}
			}
			
			
		}

	}

}
