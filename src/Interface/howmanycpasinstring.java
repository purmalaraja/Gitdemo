package Interface;

public class howmanycpasinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Iam Born INHYD1958";
		System.out.println("How many caps letters in string: " + str);
		// String characters= "";
		String output = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			String current = Character.toString(str.charAt(i));
			if (str.toLowerCase().contains(current)) {
				str= str.replaceAll("\\s", "");
				str = str.replaceAll("[0-9]", " ");  
				count = count + 1;

			}

		}
		System.out.println(count);
	}

}
