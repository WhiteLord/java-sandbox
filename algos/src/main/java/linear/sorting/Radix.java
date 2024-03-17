package linear.sorting;

import generators.RandomNumberGenerator;

import java.util.Arrays;

/**
 * This is a radix sort implementation - an algorithm useful for primitives
 * The algorithm provides worst case solution of O(xn) or O(k+n) time complexity
 */
public class Radix {

//    public static void main(String... args) {
//        final int[] randomNumbers =  new RandomNumberGenerator().generateArray(0, 10000, 600);
//        final int maxNumFromArray = findMaxNumFromArray(randomNumbers);
//        final int numberOfDigitsInMaxNum = findMaxNumberOfDigitsInNumber(maxNumFromArray);
//        final int[] sortedArray = radixCountSort(randomNumbers, numberOfDigitsInMaxNum);
//    }
//
//    public static int findMaxNumFromArray(int[] array) {
//        if (array == null || array.length == 0) {
//            throw new RuntimeException("Provided array cannot be null or empty!");
//        }
//        int maxNum = array[0];
//        for (int item: array) {
//            if (item > maxNum) {
//                maxNum = item;
//            }
//        }
//        return maxNum;
//    }
//
//    public static int findMaxNumberOfDigitsInNumber(int num) {
//        if (num < 0) {
//            throw new RuntimeException("The provided number cannot be less than 0");
//        }
//        if (num == 0) {
//            return 0;
//        }
//        return 1 + findMaxNumberOfDigitsInNumber(num / 10);
//    }
//
//    /**
//     * An implementation of radix sort using the stable count sort algo
//     * @param inputArray
//     * @param maxNumOfDigits
//     * @return
//     */
//    public static int[] radixCountSort(int[] inputArray, int maxNumOfDigits) {
//        int[] solution = inputArray.clone();
//        int exp = 10;
//        for (int i = 1; i <= maxNumOfDigits ; i++) {
//            exp = Math.pow(exp, i);
//            int[] bucket = new int[10];
//        }
//    }

    // A utility function to get maximum value in arr[]
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // The main function to that sorts arr[] of
    // size n using Radix Sort
    static void radixsort(int arr[], int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);

        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    // A utility function to print an array
    static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Main driver method
    public static void main(String[] args)
    {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;

        // Function Call
        radixsort(arr, n);
        print(arr, n);
    }
}
