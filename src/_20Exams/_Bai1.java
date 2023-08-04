package _20Exams;

public class Bai1_1 {
    // *Tính tôngr các giá trị lớn hơn giá trị đứng liền trước nó trong mảng 1 chiều các số thực
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 5, 13, 54, 76, 12, 43, 44};
        int total = caculatorSum(arr);
        System.out.println("Tổng giá trị trong mảng là: " + total);
    }

    private static int caculatorSum(int[] arr) {
        int sum = 0;
        if (arr.length > 0) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    sum += arr[i];
                } else if (arr.length == 1) {
                    return arr[0];

                }
            }
        }
        return sum;
    }
}
