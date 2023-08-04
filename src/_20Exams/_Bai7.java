package _20Exams;

import java.util.Arrays;
//Bài 7: Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí
public class _Bai7 {
    public static void main(String[] args) {
        int[] arr = {-5, 10, -3, 7, 2, -8, 9};

        System.out.println("Mảng trước khi sắp xếp số dương tăng dần: ");
        System.out.println(Arrays.toString(arr));

        sortPositiveNumbers(arr);

        System.out.println("Mảng sau khi sắp xếp số dương tăng dần: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void sortPositiveNumbers(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > 0 && arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}
