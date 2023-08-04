package _20Exams;

//Bài 5: Kiểm tra mảng có giảm dần hay không
public class _Bai5 {
    public static boolean isDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = {1, 3, 5, 7, 9};

        boolean result1 = isDecreasing(arr1);
        boolean result2 = isDecreasing(arr2);

        System.out.println("Is arr1 decreasing? " + result1);
        System.out.println("Is arr2 decreasing? " + result2);
    }
}

