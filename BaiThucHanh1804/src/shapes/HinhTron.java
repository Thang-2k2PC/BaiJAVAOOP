package shapes;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HinhTron extends HinhHoc{
    public float Bk;
    
    public  HinhTron(){
        name = "Hinh Tron";
    }
    public void inputBk(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap R: ");
        Bk = input.nextFloat();
    }
    
    public void tinhChuVi(){
        chuVi = 2* PI * Bk;
    }
    
    public void tinhDienTich(){
        dienTich = PI * Bk * Bk;
    }
}
