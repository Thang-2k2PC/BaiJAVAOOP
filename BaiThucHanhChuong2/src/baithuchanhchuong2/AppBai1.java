package baithuchanhchuong2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AppBai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so a:");
        int a = input.nextInt();
        System.out.print("Nhap vao so b:");
        int b = input.nextInt();
        System.out.println("Tong a + b = " + (a+b));
        System.out.println("Hieu a - b = "+ (a-b));
        System.out.println("Tich a * b = "+ a*b);
        System.out.println("phan Du a / b = "+ a%b);
        if(a > b){
            System.out.println("a > b");
        }else System.out.println("a < b");
    }
    
}
