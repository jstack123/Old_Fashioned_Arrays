package _01_array_manipulation;

public class Inserting {

	public static int[] insertAt(int[] testArray, int location, int num) {
		int[] temp = new int[testArray.length + 1];

		for (int i = 0; i < temp.length; i++) {
			if (i < temp.length) {

				if (i == location) {
					temp[location] = num;
				} else if (i < location) {
					temp[i] = testArray[i];
				} else if (i > location) {
					temp[i] = testArray[i - 1];
				}
			}
			System.out.println(temp[i]);
		}

		// testArray = testArray.length-1;

		return temp;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String word) {
		String[] newArray = new String[orderedArray.length + 1];

		for (int i = 0; i < orderedArray.length; i++) {
			/*
			 * for (int j = i+1; j < orderedArray.length; j++) { if
			 * (orderedArray[i].compareTo(orderedArray[j])>0) { String temp =
			 * orderedArray[i]; orderedArray[i] = orderedArray[j]; orderedArray[j] = temp; }
			 * 
			 * }
			 */

			/*
			 * if (i==0) { newArray[0] = word; } else if(i==newArray.length-1) {
			 * newArray[newArray.length-1] = word; } else { newArray[i] = orderedArray[i-1];
			 * 
			 * }
			 */

			newArray[i] = orderedArray[i];
		
			System.out.println(orderedArray[i]);
		}
		newArray[newArray.length-1] = word;
		Sorting.sort(newArray);
		return newArray;
	}

}
