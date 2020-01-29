
public class string {

	public static void main(String[] args) {
		String name = "rajasheker";
		int distinct = 0;

		//char[] inp = name.toCharArray();

		System.out.println("Duplicate characters in a given string: ");
		// System.out.println(name.charAt(9));
		// System.out.println(name.indexOf("j"));
		// System.out.println(name.toUpperCase());
		// System.out.println(name.substring(5));

		for (int i = 0; i <name.length(); i++) {

			for (int j = 0; j < name.length(); j++) {

				if (name.charAt(i) == name.charAt(j)) {

					distinct++;
				}
				   
                   System.out.println(name.charAt(i)+"--"+distinct);
                   String d=String.valueOf(name.charAt(i)).trim();
                   name=name.replace(d, "");
                   distinct=0;
			}
		}

	}
}
