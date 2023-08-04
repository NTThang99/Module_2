import java.util.Arrays;
//Chuyen so le ve dau mang
public class Main {
        public static void main(String[] args) {
            int[] arr = { 2, 5, 8, 3, 7, 9, 4, 6 };

            System.out.println("Mảng trước khi di chuyển số lẻ về đầu: ");
            System.out.println(Arrays.toString(arr));

            moveOddNumbersToFront(arr);

            System.out.println("Mảng sau khi di chuyển số lẻ về đầu: ");
            System.out.println(Arrays.toString(arr));
        }

        public static void moveOddNumbersToFront(int[] arr) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                while (left < right && arr[left] % 2 != 0) {
                    left++; // Tìm phần tử chẵn đầu tiên từ trái sang
                }

                while (left < right && arr[right] % 2 == 0) {
                    right--; // Tìm phần tử lẻ đầu tiên từ phải sang
                }

                if (left < right) {
                    // Hoán đổi giá trị của hai phần tử
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
            }
        }
    }