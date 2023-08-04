package _20Exams;

//Bài 4: Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0
public class _Bai4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 0};
        int[] arr2 = {1, 2, 3, 4, 5};
        int result1 = containZero(arr1);
        int result2 = containZero(arr2);
        System.out.println("Check if array has value 0 or not? " + result1);
        System.out.println("Check if array has value 0 or not? " + result2);

    }

    private static int containZero(int[] arr) {
        for (int num : arr) {
            if (num == 0) {
                return 1;
            }
        }
        return 0;
    }
}
