
public class removeduplicates {

	public  void duplicate1() {
	
		String name1 = "madDAammmmmmQQQqqqqqqqq";// abcfedrt
		String name =name1.toLowerCase();
		String output = "";
		for (int i = 0; i < name.length(); i++) {

			String currnet = Character.toString(name.charAt(i));

			if (name.contains(currnet)) {

				if (!output.contains(currnet)) {
					output = output + currnet;
				}

			}
			// str = str + currnet;

		}
		System.out.println(output);

	}
	public  void duplicate2() {
		String str="rajasheker reddy 123";
		String st="";
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(st.contains(c+"")) {
				
			}
			else {
				
				st=st+c;
			}
		}
		System.out.println(st);
		
	}
	
	public static void main(String[] args) {
		
		removeduplicates rd =new removeduplicates();
		rd.duplicate1();
		rd.duplicate2();
		
	}
}
