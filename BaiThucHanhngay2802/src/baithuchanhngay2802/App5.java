package baithuchanhngay2802;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        boolean c;
        do {
            System.out.print("Input n = ");
            n = input.nextInt();
        } while (n <= 0);
        c = Check(n);
        if (c) {
            System.out.format( "%d la so hoan thien", n);
        } else {
            System.out.format(" %d khong phai la so hoan thien", n);
        }
    }
    public static boolean Check(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}