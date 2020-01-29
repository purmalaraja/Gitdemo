package collections;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a =new ArrayList<String>();
		a.add("raja");
		a.add("Rahul");
		
		a.add(0, "sushruth");
		
		//a.remove(2);
		System.out.println(a.indexOf("sushruth"));
		//a.removeAll(a);
		System.out.println(a.get(1));
		System.out.println(a);
		System.out.println(a.contains("test"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());

	}

}
