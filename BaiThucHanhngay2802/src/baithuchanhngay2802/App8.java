package baithuchanhngay2802;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n = 1, max = 0;
        while(n != 0){
            System.out.println("Nhap so thuc n: ");
            n =input.nextFloat();
            if(n > max ) max = n;
        }
        if(max % 5 == 0)
        System.out.println("Max ="+ max);
    }
}
