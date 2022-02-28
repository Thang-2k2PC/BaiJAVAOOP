package baithuchanhngay2802;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App1 {
    private static final Scanner input = new Scanner(System.in);
    public static int UCLN(int a, int b){
        while( a!= b) {
            if(a > b){
                a = a- b;
            }else b = b - a;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong a:");
        int a = input.nextInt();
        System.out.print("Nhap so nguyen duong b:");
        int b = input.nextInt();
        System.out.format("Uoc chung lon nhat gio %d va %d la: %d", a, b,
                UCLN(a, b));
        System.out.println();
    }
    
}
