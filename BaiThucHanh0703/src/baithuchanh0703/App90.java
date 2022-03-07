package baithuchanh0703;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char kyTu;
        System.out.println("Nhap chuoi:");
        String chuoi = input.nextLine();;
        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
    }
}
