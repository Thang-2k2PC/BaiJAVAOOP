package shapes;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        name = "Hinh vuong";
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap canh : ");
        CD = CR = input.nextFloat();
    }
}
