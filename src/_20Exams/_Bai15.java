package _20Exams;

import java.util.Arrays;

//Bài 15: Hãy đưa tất cả các số 1 về đầu mảng
public class _Bai15 {
    public static int[] moveOnesToEdges(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[arr.length];
        for(int i = right; i >= 0; i--) {
            if (arr[i] == 1) {
                result[left] = 1;
                left++;
            } else {
                result[right] = arr[i];
                right--;
            }
        }
//        for (int num : arr) {
//            if (num == 1) {
//                result[left] = 1;
//                left++;
//            } else {
//                result[right] = num;
//                right--;
//            }
//        }
        return result;
    }

// 1, 1, 2, 3, 4, 5, 6, 12, 45, 65
//     1, 1, 2, 3, 4, 5, 6,
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,1,1,12,45,65};
        int[] newArr = moveOnesToEdges(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("New array after inserting element " + Arrays.toString(newArr));
    }
}
