package baithuchanh2103;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SinhVien {
    String MaSV, HoTen, gender, address, Ngaysinh;
    public SinhVien(){
    }
    
    public SinhVien(String MaSV, String HoTen ,String gender, String address, String Ngaysinh ){
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.gender =gender;
        this.address = address;
        this.Ngaysinh =Ngaysinh;
    }
    public void Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Ma sinh vien: ");
        MaSV = input.nextLine();
        System.out.println("Nhap Ho ten: ");
        HoTen = input.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gender = input.nextLine();
        System.out.println("Nhap dia chi:");
        address = input.nextLine();
        System.out.println("Nhap ngay sinh:");
        Ngaysinh = input.nextLine();
    
    }

    @Override
    public String toString() {
        return "SinhVien{" + "MaSV = " + MaSV + ", HoTen = " + HoTen + ", gender = " + gender + ", address = " + address + ", Ngaysinh =  " + Ngaysinh + '}';
    }

    public void display(){
        System.out.println(toString());
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.Input();
        sv.display();
    }
}
