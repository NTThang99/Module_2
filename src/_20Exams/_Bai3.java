package _20Exams;
//Đếm số lượng giá trị tận cùng bằng 5 trong mảng.
public class _Bai3 {
    public static void main(String[] args) {
        int[] arr = {5, 15, 25, 63, 35, 74, 90, 45, 55, 5};

        int count = countValuesEndingWithFive(arr);
        System.out.println("Số lượng giá trị tận cùng bằng 5 trong mảng: " + count);
    }

    public static int countValuesEndingWithFive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 5) {
                count++;
            }
        }
        return count;
    }
}