package sorts;

public class Selection {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		selectionSort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" " + intArray[i]);
		}
		

	}
	
	
	//ascending order
	public static int[] selectionSort (int[] list) {
		int i, j, minValue, minIndex, temp = 0;
		for (i = 0; i < list.length-1; i++) {
			minValue = list[i];
			minIndex = i;
			//we store init index AND VALUE of outer loop and then compare each element in array with the help of inner loop
			for (j = i; j < list.length; j++) {
				if (list[j] < minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			//once we see that we find another smaller element than init outer loop ith element, we swap
			//so lowest element comes in the beginning and that init element will go to last index.
			if (minValue < list[i]) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
		
		return list;
	}
	//descending order
	public static int[] selectionSortDescending (int[] list) {
		int i, j, maxValue, maxIndex, temp = 0;
		for (i = 0; i < list.length-1; i++) {
			maxValue = list[i];
			maxIndex = i;
			for (j = i; j < list.length; j++) {
				if (list[j] > maxValue) {
					maxValue = list[j];
					maxIndex = j;
				}
			}
			if (maxValue > list[i]) {
				temp = list[i];
				list[i] = list[maxIndex];
				list[maxIndex] = temp;
			}
		}
		
		return list;
	}

}
