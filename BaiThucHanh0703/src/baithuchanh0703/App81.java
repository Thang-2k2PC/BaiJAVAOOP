package baithuchanh0703;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so hang m: ");
        int m = input.nextInt();
        System.out.println("Nhap so cot n");
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhap phan tu arr[%d][%d] =", i, j);
                arr[i][j] = input.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran la " + max);

    }

}
