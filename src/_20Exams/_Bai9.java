package _20Exams;

import java.util.Arrays;

//Bài 9: Sắp xếp số dương tăng dần, âm giảm dần. Vị trí tương đối không thay đổi
public class _Bai9 {
    public static void main(String[] args) {
        int[] arr = {5, 10, -3, 7, 2, -8, 9};

        System.out.println("Mảng trước khi sắp xếp số dương tăng dần, âm giảm dần: ");
        System.out.println(Arrays.toString(arr));

        sortPositiveNumbers(arr);

        System.out.println("Mảng sau khi sắp xếp số dương tăng dần, âm giảm dần: ");
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
        for (int i = 0; i < n; i++){
            if (arr[i] < 0){
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < 0 && arr[i] < arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
        }
    }
}
