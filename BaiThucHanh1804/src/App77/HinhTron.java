package App77;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HinhTron extends HinhHoc{
    protected float banKinh;
    private Scanner scanner;
    public HinhTron(){
        super();
        scanner = new Scanner(System.in);
    }

    @Override
    public void nhapBanKinh() {
        System.out.println("Ban dung don vi tinh nao: ");
        System.out.println("\t1 - Centimet");
        System.out.println("\t2 inch");
        Configs.donVi = scanner.nextInt();
        
        System.out.println("Nhap BK hinh tron: ");
        banKinh = scanner.nextFloat();
    }
    
    public void inThongTin(){
        if(Configs.donVi == Configs.DON_VI_CM){
            System.out.println("Hinh tron co BK " + banKinh + " cm");
            System.out.println("Tuong duong " + Configs.ChuyenCentimetsSangInch(banKinh));
            System.out.println("Hinh tron co BK " + banKinh + "inch");
            System.out.println("Tuong duong " + Configs.ChuyenInchSangCentimet(banKinh));
        }
    }
}
