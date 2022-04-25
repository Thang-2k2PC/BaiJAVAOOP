package Person;

import Person.Person;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Employee extends Person {

    String MaNV;
    int salary;
     public static final int NHAN_VIEN_SEP = 1;
    public static final int NHAN_VIEN_LINH = 2;

    public static final long LUONG_NHAN_VIEN_FULL_TIME_SEP=20000000;
    public static final long LUONG_NHAN_VIEN_FULL_TIME_LINH= 10000000;
    public static final long LUONG_NHAN_VIEN_PART_TIME_MOI_GIO=100000;
    
    public Employee() {
    }

    public Employee(String MaNV) {
        this.MaNV = MaNV;
    }
    
    public Employee(String MaNV, int salary, String name, int age, String address) {
        super(name, age, address);
        this.MaNV = MaNV;
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap MaNV: ");
        MaNV = input.nextLine();
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n MaNV: " + MaNV ;
    }

    @Override
    public void display() {
        System.out.println(this);
    }
    public void tinhLuong(){
    }
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

   

    

}
