package _20Exams;

import java.util.Scanner;

//Bài 8: hiển thị các cột chẵn
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of columns: ");
        int totalColumns = sc.nextInt();
        sc.close();
        for (int col = 2; col <= totalColumns ; col+=2) {
            System.out.println("Even Column is: " + col);
        }
    }
}
