package _20Exams;

//Bài 4: Đảo ngược mảng
public class Bai4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 6, 7};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Mang sau khi dao nguoc: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}
