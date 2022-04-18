package shapes;

/**
 *
 * @author DELL
 */
public class HinhHoc {
    public float PI =3.14f;
    public String name;
    public float chuVi;
    public float dienTich;
    public float theTich;
    
    public HinhHoc(){
    }
    
    public void xuartTen(){
        System.out.println("\n\n===== " + name + "===");
    }
    
    public void inChuVi(){
        System.out.println("Chu vi = " + chuVi);
    }
    
    public void inDienTich(){
        System.out.println("dien tich = " + dienTich);
    }
    
    public void InTheTich(){
        System.out.println("The tich = " + theTich);
    }
}
