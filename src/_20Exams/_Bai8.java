package _20Exams;

import java.util.Arrays;

//Bài 8: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
public class _Bai8 {
    public static void main(String[] args) {
        int[] arr = {2, 10, 4, 7, 2, 8, 9};

        System.out.println("Mảng trước khi sắp xếp số lẻ tăng dần: ");
        System.out.println(Arrays.toString(arr));

        sortPositiveNumbers(arr);

        System.out.println("Mảng sau khi sắp xếp số lẻ tăng dần: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void sortPositiveNumbers(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] % 2 != 0 && arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}
