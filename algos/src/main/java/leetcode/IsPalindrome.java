package leetcode;

public class IsPalindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0 || x == 10) {
            return false;
        }
        if (x == 0 || x < 10) {
            return true;
        }
        int maxNumOfDigits = findMaxNumberOfDigitsInNumber(x);
        int[] arra = new int[maxNumOfDigits];
        int coopyNum = x;
        for (int i=0; i < maxNumOfDigits; i++) {
            arra[i] = coopyNum % 10;
            coopyNum /= 10;
        }
        for (int num: arra) {
            coopyNum = coopyNum * 10 + num;
        }
        return coopyNum - x == 0 ? true : false;
    }

    public static int findMaxNumberOfDigitsInNumber(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + findMaxNumberOfDigitsInNumber(num / 10);
    }
}
