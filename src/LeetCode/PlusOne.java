package LeetCode;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] nerArr = new int[len + 1];
        nerArr[0] = 1;
        return nerArr;
    }
}
