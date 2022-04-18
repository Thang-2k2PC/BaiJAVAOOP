package App71;

/**
 *
 * @author DELL
 */
public class App71 {

    public static void main(String[] args) {
        HinhTron htron = new HinhTron();
        htron.setBanKinh(10);
        
        float chuVi = htron.tinhChuVi();
        float dienTich = htron.tinhdienTich();
        System.out.println("Chu vi hinh tron : " + chuVi + "\ndien tich Hinh tron: " + dienTich);
    }
    
}
