package thuchanh2102;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number, S = 0;
        do {            
            System.out.println("Nhap cac phan tu: ");
            number = input.nextInt();
            S += number;
        } while (S < 100);
        System.out.format("Tong cac so la %d", S);
        
    }
}
