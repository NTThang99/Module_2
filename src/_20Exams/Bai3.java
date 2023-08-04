package _20Exams;
//Bài 3: Tính tổng 3 giá trị lẻ đầu tiên
public class Bai3 {
    public static void main(String[] args) {
        int [] arr = {1,23,4,5,6,7,8,9,12};
        int sum = 0;
        int count = 0;
        int n = 3;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 != 0){
                sum += arr[i];
                count++;
            }if (count == n){
                break;
            }

        }
        System.out.println("Tổng của 3 số lẻ đầu tiên là: " + sum);
    }
}
