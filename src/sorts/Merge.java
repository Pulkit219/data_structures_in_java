package sorts;

public class Merge {
    
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        Merge mms = new Merge();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
//public class Merge {
//	static int[] array, tempMergeArray;
//	static int length;
//	public static void main(String[] args) {
//		int[] intArray = { 48,36,13,52,19,94,21 };
//		mergeSort(intArray);
//		for (int i = 0; i < intArray.length; i++) {
//			System.out.print(" " + intArray[i]);
//		}
//	}
//	
//	
//	public static void mergeSort(int[] InputArr) {
//		
////		if(InputArr.length<=1)return;
//		array =InputArr;
//		length =InputArr.length;
//		tempMergeArray= new int[length];
//		divideArray(0, length-1);
//	}
//	
//	
//	public static void divideArray(int lowerIndex, int HigherIndex)
//	{
//		if(lowerIndex<HigherIndex) {
//			int middle=(lowerIndex+HigherIndex)/2;
//			//LEFT ARRAY keep dividing the array until single element is left 
//			divideArray(lowerIndex, middle);
//			//RIGHT ARRAY keep dividing the array until single element is left 
//			divideArray(middle+1, HigherIndex);
//			mergeArray(lowerIndex,middle,HigherIndex);
//		}
//	}
//	
//	
//	
//	public static void mergeArray(int lowerIndex, int middle, int higherIndex) {
//		for (int i = lowerIndex; i <= higherIndex; i++) {
//			tempMergeArray[i]=array[i];
//		}
//		
//		int i =lowerIndex;
//		int j=middle+1;
//		int k=lowerIndex;
//		while(i<=middle && j<=higherIndex) {
//			if(tempMergeArray[i]<=tempMergeArray[j]) {
//				array[k]=tempMergeArray[i];
//				i++;
//			}
//			else {
//				array[k]=tempMergeArray[j];
//				j++;
//			}
//		}
//		k++;
//		while (i <= middle) {
//            array[k] = tempMergeArray[i];
//            k++;
//            i++;
//        }
//	}
//
//}
