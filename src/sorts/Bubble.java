package sorts;

public class Bubble {

	public static void main(String[] args) {
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
//		bubbleSort(intArray);
		bubbleSortDescending(intArray);
		for (int i = 0; i < intArray.length-1; i++) {
			System.out.print(" " + intArray[i]);
		}
		
		
		
	}
	//bubble sort ascending order
	public static int[] bubbleSort (int[] list) {
		int i, j, temp = 0;
		for (i = 0; i < list.length - 1; i++) {
			for (j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}
	
	
	//bubble sort Descending  order
	
	public static int[] bubbleSortDescending (int[] list) {
		int i, j, temp = 0;
		for (i = 0; i < list.length - 1; i++) { //why length-1 because iterations will be 1 lesser than number of elements, try it!!
			for (j = 0; j < list.length - 1 - i; j++) {//why -1-i because for each ith iteration element will bubble up in the end in ,so j comparisons will start to shrink by i number
				if (list[j] < list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}
	
	

}
