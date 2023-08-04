package _20Exams;

import java.util.Arrays;

//Bài 11: Thêm x vào trong mảng tăng nhưng vẫn giữ nguyên tính tăng của mảng
public class _Bai11 {
    public static int[] insertElementInAscendingOder(int[] arr, int x) {
        int[] result = new int[arr.length + 1];
        int index = 0;
        while (index < arr.length && arr[index] < x){
            result[index] = arr[index];
            index++;
        }
        result[index] = x;
        for (int i = index + 1; i < result.length ; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,8,9,11};
        int x = 4;
        int [] newArr = insertElementInAscendingOder(arr,x);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("New array after inserting element " + x + ": " + Arrays.toString(newArr));
    }
}
