package baithuchanh2103;

/**
 *
 * @author DELL
 */
public class App2103 {

    /**
     * @param args the command line arguments
     */
         
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.Input();
        hcn.TinhHCN();
        
        Person sc = new Person();
        sc.Input();
        sc.display();
        
        SinhVien sv = new SinhVien();
        sv.Input();
        sv.display();
        
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
        pt.Input();
        pt.GiaiPt();
    }
}


