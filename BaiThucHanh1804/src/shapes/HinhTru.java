package shapes;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HinhTru extends HinhTron {
    public float height;
    
    public HinhTru(){
        name = "Hinh tru";
    }
    
    public void input(){
        inputBk();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap h: ");
        height = input.nextFloat();
    }
    
    public void TheTich(){
        tinhDienTich();
        theTich = dienTich * height;
    }
}
