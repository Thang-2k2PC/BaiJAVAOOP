package shapes;

import shapes.HinhChuNhat;

/**
 *
 * @author DELL
 */
public class App54 {
    public static void main(String[] args) {
        HinhTron htron = new HinhTron();
        htron.xuartTen();
        htron.inputBk();
        htron.tinhChuVi();
        htron.tinhDienTich();
        
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuartTen();
        hcn.input();
        hcn.chuvi();
        hcn.dientich();
         
        HinhVuong hv = new HinhVuong();
        hv.xuartTen();
        hv.input();
        hv.chuvi();
        hv.dientich();
       
        
        
    }
}
