package Interface;

public class aplhanumaric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IamBornINHYD 123";
		System.out.println("Given sring string: " + str);
		//System.out.println("2.How many caps letters in string: " + str);
		// String characters= "";
		String uppercase = "";
		String Lowercase = "";
		int count = 0;
		int count1 = 0;
		int digits = 0 ;
		int count2=0;
		for (int i = 0; i < str.length(); i++) {
			String current = Character.toString(str.charAt(i));
			char current1 = str.charAt(i);
			if (str.toUpperCase().contains(current)) {
              
				uppercase = uppercase + current;
				count =count+1;
			}
                  else if((str.toLowerCase().contains(current))){
                	  Lowercase = Lowercase + current;
                      count1 =count1+1;
                  }
                  else if(Character.isDigit(current1)) {
                	  
                	  digits++;
                	  count2=count2+1;
                  }
			
			}
		System.out.println("caps letters in string: "+uppercase);
		System.out.println("How many caps letters in string: "+count);
		System.out.println("small letters in string: "+Lowercase);
		System.out.println("How many small letters in string: "+count1);
		System.out.println("numbers in string: "+digits);
		System.out.println("How many numbers in string: "+count2);
	
		
		}
		
	}


