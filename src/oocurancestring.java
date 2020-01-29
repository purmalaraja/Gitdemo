
public class oocurancestring {

	public static void main(String[] args) {

		String str = "madam";
		System.out.println("How many char dupliactes in string:  " + str);
		String characters = "";
		String duplicates = "";

		for (int i = 0; i < str.length(); i++) {
			String currnet = Character.toString(str.charAt(i));
			//System.out.println(currnet);
			if (characters.contains(currnet)) {
				if (!duplicates.contains(currnet)) {
					duplicates = duplicates + currnet + ",";
				}

			}
			characters = characters + currnet;

		}
		System.out.println(duplicates);
	}

}
