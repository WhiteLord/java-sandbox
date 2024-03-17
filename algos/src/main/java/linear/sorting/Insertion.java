package linear.sorting;

public class Insertion {

    public static int[] sort(int[] inputArray) {
        for (int i=1; i <inputArray.length; i++) {
            int key = inputArray[i];
            int secondaryIndex = i - 1;
            while (secondaryIndex >= 0 && inputArray[secondaryIndex] > key) {
                inputArray[secondaryIndex+1] = inputArray[secondaryIndex];
                secondaryIndex = secondaryIndex - 1;
            }
            inputArray[secondaryIndex + 1] = key;
        }
        return inputArray;
    }
}
