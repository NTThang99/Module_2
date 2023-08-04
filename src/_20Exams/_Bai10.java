package _20Exams;

import java.util.Arrays;

//Bài 10: Thêm 1 phần tử x vào mảng tại vị trí k
public class _Bai10 {
    public static int[] insertElement(int[] arr, int k, int x) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        result[k] = x;
        for (int i = k + 1; i < result.length; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 10;
        int k = 5;
        int[] newArr = insertElement(arr, k, x);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("New array after inserting element " + x + " at position " + k + ": " + Arrays.toString(newArr));
    }
}

