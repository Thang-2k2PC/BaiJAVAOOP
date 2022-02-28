package baithuchanhngay2802;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App2 {

    private static final Scanner input = new Scanner(System.in);

    /*
    Nhập vào 3 số thực dùng làm số đo 3 cạnh của một tam giác, sau đó xác định xem 
       tam giác tương ứng có tính chất gì: đều, vuông cân, cân, vuông hay thường.
     */
    public static int Check(int a, int b, int c) {
        if (a+b>c && a+c>b && b+c>a) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Day la tam giac vuong");
            } else if (a == b && b == c) {
                System.out.println("Day la tam giac deu");
            } else if (a == b || a == c || b == c) {
                System.out.println("Day la tam giac can");
            }
        }else System.out.println("Day khong phai la tam giac");
         return 0;
    }
public static void main(String[] args) {
        System.out.print("Nhap canh a:");
        int a = input.nextInt();
        System.out.print("Nhap canh b:");
        int b = input.nextInt();
        System.out.print("Nhap canh c:");
        int c = input.nextInt();
        System.out.println(Check(a, b, c));
    }
    
}
