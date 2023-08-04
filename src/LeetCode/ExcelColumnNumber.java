package LeetCode;

public class ExcelColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        int n = columnTitle.length();

        for (int i = 0; i < n; i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
