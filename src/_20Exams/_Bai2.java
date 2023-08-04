package _20Exams;
//Bài 2: Hãy liệt kê các vị trí mà giá trị tại đó là số nguyên tố
public class _Bai2 {
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void listPositionsOfPrimes(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])){
                System.out.println("Index " + i + " contains a prime number:  " + arr[i]);
            }
            
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,41,5,6,7,8,9,10,11,13,15};
        listPositionsOfPrimes(arr);
    }
}
