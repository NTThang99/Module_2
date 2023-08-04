package _20Exams;

//Bài 6: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
public class _Bai6 {
    public static boolean areAllElementsInArray(int[] a, int[] b) {
        for (int numA : a) {
            boolean check = false;
            for (int numB : b) {
                if (numA == numB) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        boolean result = areAllElementsInArray(a, b);
        System.out.println("If all the elements in array a are in array b? " + result);
    }
}
