
public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a[] = new int [5];//declare array and allocate the memory for the values.
		 * a[0]=0; a[1]=1; a[2]=2; a[3]=3; a[4]=4;
		 */
		int arr[] = { 0, 2, 2, 2, 2, 4, 5, 6, 7, 7, 7, 7, 8, 8, 8, 8 };
		int duplicates = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			int k = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					if (!(duplicates == arr[j])) {

						duplicates = arr[i];
						count++;
						k = count;
						System.out.println("Duplicate N0#:" + duplicates);

					}

				}
				//System.out.println(" repeated: " + k);
				
			}

		}

	}

}
