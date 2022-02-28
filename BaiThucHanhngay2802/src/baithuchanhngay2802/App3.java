package baithuchanhngay2802;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App3 {
    /* Nhập vào 1 số nguyên dương, kiểm tra xem nó có phải nguyên tố không ? 
      (số nguyên tố sẽ không chia hết cho tất cả các số từ 2 đến số tự nhiên đi trước số đó).
    */
    public static boolean Check(int n){
        if (n <= 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
    }
    
    public static void main(String[]agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so n:");
        int n = input.nextInt();
        if(Check(n)){
             System.out.println(n + " la so nguyen to");
       } else {
           System.out.println(n + " khong la so nguyen to");
        }
    }
}
