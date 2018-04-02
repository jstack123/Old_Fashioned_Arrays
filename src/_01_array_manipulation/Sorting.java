package _01_array_manipulation;

public class Sorting {

	public static String[] sort(String[] testArray) {
		for (int i = 0; i < testArray.length; i++) {
			for (int j = i + 1; j < testArray.length; j++) {
				if (testArray[i].compareTo(testArray[j]) > 0) {
					String temp = testArray[i];
					testArray[i] = testArray[j];
					testArray[j] = temp;
					// System.out.println(temp);
					// System.out.println(testArray[j]);
				}
			}

		}
		return testArray;
	}

}
