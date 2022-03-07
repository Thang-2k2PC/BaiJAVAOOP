package baithuchanhchuong2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AppBai5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        do {
            System.out.println("Nhap vao cac so:");
            int n = input.nextInt();
            sum += n;
        } while (sum < 100);
        System.out.println("Sum = " + sum);
    }
}
