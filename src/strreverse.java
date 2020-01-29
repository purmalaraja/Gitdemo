
public class strreverse {
	
	public static void main(String[] args) {
		String name = "madam";
		String str ="";
		for(int i=name.length()-1;i>=0;i--) {
			//System.out.println(name.charAt(i));
			
			str=str+name.charAt(i);
			System.out.println(str);
		}
		System.out.println(str);
			if(name.equals(str)) {
				System.out.println("it is palendrome");
				
			}
			else {
				System.out.println("it is not   palendrome");
			}
		}
	}


