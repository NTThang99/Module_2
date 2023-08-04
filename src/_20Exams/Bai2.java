package _20Exams;
//Bài 2: tìm giá trị lớn thứ 2 trong mảng
public class Bai2 {
    public static void main(String[] args) {
        int [] arr = {12,2,5,6,78,54,31,7,5};
        int sencondMaxValue = findSecondMaxValue(arr);
        System.out.println("Gia tri lon thu hai trong mang la: " + sencondMaxValue);
    }

    private static int findSecondMaxValue(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > secondMax && arr[i] < max){
                secondMax = arr [i];
            }
        }
        return secondMax;
    }
}
