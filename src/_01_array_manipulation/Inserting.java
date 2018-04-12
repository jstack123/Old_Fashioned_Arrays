package _01_array_manipulation;

public class Inserting {

	public static int[] insertAt(int[] testArray, int location, int num) {
	int[] temp = new int[testArray.length+1];
	
	for (int i = 0; i < temp.length; i++) {
		if (i<temp.length) {
			
		if (i==location) {
			temp[location] = num;
		} else if (i<location) {
			temp[i] = testArray[i];
		}else if(i>location) {
			temp[i] = testArray[i-1];
		}
	}
		System.out.println(temp[i]);
	}
	
		
	
			 //testArray = testArray.length-1;
			
		return temp;
	}

}
