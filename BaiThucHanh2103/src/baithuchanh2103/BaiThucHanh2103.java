package baithuchanh2103;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BaiThucHanh2103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.NhapR();
        ht.TinhCV();
        ht.TinhDT();
    }
}
class HinhTron{
    final float PI = 3.14f;
    float r;
    float CVi;
    float dtich;
    void NhapR(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap R:");
        r = input.nextFloat();
    }
    void TinhCV(){
        CVi = 2 * PI * r;
        System.out.println("Chu vi Hinh tron: " + CVi);
    }
    void TinhDT(){
        dtich = PI * r * r;
        System.out.println("Dien tich hinh tron: " + dtich);
    }
}