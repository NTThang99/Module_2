package SortAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int [] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length - 1; j > i ; j--){
                if (list[j] > list[j-1]){
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list ={1,5,66,55,22,57,76,2};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));

    }
}
