package baithuchanh2103;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class HinhChuNhat {
    int CDai;
    int CRong;
    int chuVi;
    int dtich;
    public HinhChuNhat(int CDai, int CRong){
        this.CDai = CDai;
        this.CRong = CRong;
    }

    public HinhChuNhat() {
    }

    public void Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu dai HCN :" );
        CDai = input.nextInt();
        System.out.println("Nhap chieu rong HCN:");
        CRong = input.nextInt();
        
    }
    void  TinhHCN(){
        chuVi = (CDai + CRong) * 2;
        System.out.println("Chu vi HCN:" + chuVi);
        dtich = CDai * CRong;
        System.out.println("Dien tich HCN:" + dtich);
    }
}
