package baithuchanhngay2802;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so duong n:");
        int n = input.nextInt();
        check(n);
    }
    public static int check(int n){
        int count = 0;
        while(n > 0){
            n = n /10;
            count ++;
        }
         System.out.printf("co tong cac so la: %d" , count);
        return count;
    }
}
