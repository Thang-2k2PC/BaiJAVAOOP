package baithuchanhchuong2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AppBai2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = input.nextInt();
        if(n % 2 == 0){
            System.out.println("n la so chan");
        }else System.out.println("n la so le ");
    }
}
