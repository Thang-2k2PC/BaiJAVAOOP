package thuchanh2102;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int SoDu, S = 0;
        System.out.println("Nhap so n: ");
        int n = input.nextInt();
        while (n > 0) {            
            SoDu = n % 10;
            n = n/10;
            S += SoDu;
        }
        System.out.println("S = " + S);
    }
    
}
