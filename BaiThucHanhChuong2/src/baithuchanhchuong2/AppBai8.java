package baithuchanhchuong2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AppBai8 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Nhap so phan tu n:");
         int n = input.nextInt();
         int a,sum = 0;
         for(int i = 1; i <= n ; i++){
             System.out.printf("Nhap phan tu thu %d =", i);
             a =input.nextInt();
             sum+= a;
         }
         float sumTb = (float) sum/n;
         System.out.println("Tb cong = " + sumTb);
    }
}
