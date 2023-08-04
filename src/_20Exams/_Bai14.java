package _20Exams;

import javax.xml.datatype.Duration;
import java.util.Arrays;
import java.util.HashSet;

//Bài 14: Xóa tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử
public class _Bai14 {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        int[] result;
        int index = 0;
        // Lưu giữ các giá trị duy nhất vào HashSet
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // Tạo mảng mới chứa các giá trị duy nhất
        result = new int[uniqueSet.size()];
        for (int num : uniqueSet) {
            result[index] = num;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5, 5, 6, 7};
        int[] newArr = removeDuplicates(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("New array after inserting element " + Arrays.toString(newArr));
    }
}
