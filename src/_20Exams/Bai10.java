package _20Exams;

//Bài 10: Tìm ra vị trí [i,j] của số chẳn đầu tiên
public class Bai10 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 4},
                {2, 4, 6},
                {8, 9, 10},
        };
        int row = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    System.out.println("Fist even number is: " + matrix[i][j]);
                    System.out.println("Position [i,j]: [" + i + "," + j + "]");
                    return;
                }

            }

        }
    }
}
