package baithuchanhchuong2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AppBai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str ; 
        char kyTu;
        int count = 0;
        do {            
            System.out.println("Nhap vao 1 chuoi: ");
            str = input.nextLine();
        } while (str.length() > 80);
        System.out.println("Np vao 1 ki tu: ");
        kyTu = input.nextLine().charAt(0);
        for(int i = 0; i < str.length(); i++){
            if(kyTu == str.charAt(i)){
                count++;
            }
        }
        System.out.printf("So lan xuat hien cua ky tu [%s] trong chuoi [%s ]la: %d\n", kyTu, str, count);
    }
}
