package thuchanh2102;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App35 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int a , b;
         System.out.print("Nhap so thu 1:");
         a = input.nextInt();
         System.out.print("Nhap so thu 2: ");
         b = input.nextInt();
         
         int min = a;
         if(a > b){
             min = b;
         }
         System.out.format("So nho nhat giua hai so [%d] va [%d] la: %d " , a, b,   min);
    }
   
}
