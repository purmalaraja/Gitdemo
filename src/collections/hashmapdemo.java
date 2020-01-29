package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "gm");
		hm.put(2, "gd");
		hm.put(3, "raj");
		hm.put(4, "su");
		System.out.println(hm.get(1));
		Set sn = hm.entrySet();
		Iterator IT = sn.iterator();
		while (IT.hasNext()) {
			Map.Entry MP=(Map.Entry)(IT.next());
			System.out.println(MP.getKey());
			System.out.println(MP.getValue());
		}

	}

}
