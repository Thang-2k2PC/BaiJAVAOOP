package baithuchanhchuong2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AppBai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 1;
        System.out.println("Nhap so n:");
        int n = input.nextInt();
        for(int i =1 ; i <= n; i++){
            sum *= i;
        }
        System.out.printf("%d! = %d", n, sum);
    }
}
