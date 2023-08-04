package _20Exams;
//Bài 11: Tính tổng các số nguyên tố trong mảng 2 chiều
public class Bai11 {
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
    public static int sumPrimesIn2DArray(int[][] arr){
        int sum = 0;
        for (int [] row : arr) {
            for (int num:row) {
                if (isPrime(num)){
                    sum += num;
                }

            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr ={
                { 2, 4, 6 },
                { 3, 7, 10 },
                { 5, 8, 11 }
        };
        int totalSum = sumPrimesIn2DArray(arr);
        System.out.println("Total sum of prime numbers in the 2D array: " + totalSum);
    }
}
