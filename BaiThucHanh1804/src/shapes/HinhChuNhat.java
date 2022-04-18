package shapes;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HinhChuNhat extends HinhHoc {
     public float CD;
     public float CR;
    
    public HinhChuNhat(){
        name = "Hinh Chu Nhat";
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap CD: ");
        CD = input.nextFloat();
        System.out.println("Nhap CR: ");
        CR = input.nextFloat();
    }
    
    public void chuvi(){
        chuVi = 2 * (CD + CR);
    }
    
    public void dientich(){
        dienTich = CR * CD;
    }

    

}

