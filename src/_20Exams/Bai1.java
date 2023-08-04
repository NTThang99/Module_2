package _20Exams;

public class Bai1 {
    public static void main(String[] args) {
        //Bài 1: tìm giá trị lớn nhất của mảng
        int [] arr = {1,4,5,11,45,54,23,11};
        int maxValue = findMaxValue(arr);
        System.out.println("Gia tri lon nhat trong mang la: " + maxValue);
    }

    private static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i ] > max){
                max = arr[i];
            }

        }
        return max;
    }


}
