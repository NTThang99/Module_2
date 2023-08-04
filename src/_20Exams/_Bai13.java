package _20Exams;

import java.util.Arrays;

//Bài 13: Xóa tất cả các số chẵn trong mảng
public class _Bai13 {
    public static int[] removeEvenNumber(int[]arr){
        int countNonEven = 0;
        for (int num : arr) {
            if (num % 2 ==0 ){
                countNonEven++;
            }

        }
        int [] result = new int [countNonEven];
        int index = 0;
        for (int num : arr) {
            if (num % 2 != 0){
                result[index] = num;
                index++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int [] newArr = removeEvenNumber(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("New array after inserting element "+ Arrays.toString(newArr));
    }
}
