package SortAlgorithm;

public class BinarySearch {
    static int binarySearch(int [] list, int key){
        int left = 0;
        int right = list.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (key < list[mid])
                right = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] list = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(list,9));
    }
}
