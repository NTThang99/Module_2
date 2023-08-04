package _20Exams;
//Bài 6: tính tổng các số nguyên tố trong mảng
public class Bai6 {
    public static void main(String[] args) {
        int[] arr = {1, 43, 5, 7, 9, 533, 123, 545, 11};
        int sumOfPrimes = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                sumOfPrimes += num;
            }
        }
        System.out.println("Tong cac so nguyen to la: " + sumOfPrimes);
    }
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0){
                return false;
            }

        }
        return true;
    }
}
