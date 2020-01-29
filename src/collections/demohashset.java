package collections;

import java.util.HashSet;
import java.util.Iterator;

public class demohashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> ha = new HashSet<String>();

		ha.add("hyd");
		ha.add("delhi");
		ha.add("chennai");
		ha.add("Hyd");
		ha.add("surath");
		ha.add("sachin");
		// System.out.println(ha);
		Iterator i = ha.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
