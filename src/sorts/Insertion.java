package sorts;

public class Insertion {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		insertionSort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" " + intArray[i]);
		}

	}
	
	//using for and while
	public static int[] insertionSort (int[] list) {
		int i, j, key, temp;
		for (i = 1; i < list.length; i++) {
			//we save current i as key and then compare it with loop( i-1 to 0)(backwards decremental array) elements if key is smaller || if yes we swap it 
			key = list[i];
			j = i - 1;
			while (j >= 0 && key < list[j]) {
				temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
				j--;
			}
		}
		return list;
	}
	
	//using for loop
	public static int[] insertionSort1 (int[] list) {
		int i, j, key, temp;
		for (i = 1; i < list.length; i++) {
			key = list[i];
			for (j = i-1; j >=0&&key<list[j] ; j--) {
				temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
			}
		}
		return list;
	}

}
