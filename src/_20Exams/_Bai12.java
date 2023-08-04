package _20Exams;

import java.util.Arrays;

//Bài 12: Xóa tất cả các số âm trong mảng
public class _Bai12 {
    public static int[] removeNegativeNumbers(int[]arr){
        int countNonNegative = 0;
        for (int num: arr) {
            if (num>= 0){
                countNonNegative++;
            }

        }
        int [] result = new int[countNonNegative];
        int index = 0;
        for (int num: arr) {
            if (num >= 0){
                result[index] = num;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,-2,3,-4,5,-7,9};
        int[] newArr = removeNegativeNumbers(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("New array after inserting element "+ Arrays.toString(newArr));
    }
}
