package Person;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class FullTimeEmployee extends Employee {

    Scanner input = new Scanner(System.in);
    int ngayLamThem;
    int loaiChucVu;

    public FullTimeEmployee(Scanner scanner, int ngayLamThem, int loaiChucVu) {
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    public FullTimeEmployee(int ngayLamThem, int loaiChucVu, String MaNV) {
        super(MaNV);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    public FullTimeEmployee(int ngayLamThem, int loaiChucVu, String MaNV, int salary, String name, int age, String address) {
        super(MaNV, salary, name, age, address);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap so ngay lam them: ");
        ngayLamThem = input.nextInt();
        System.out.println("Loai chuc vu: ");
        loaiChucVu = input.nextInt();
    }

    @Override
    public void tinhLuong() {
        if (loaiChucVu == Employee.NHAN_VIEN_LINH) {
            if (ngayLamThem >= 1) {
                salary = (int) (Employee.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * 800000);
            } else {
                salary = (int) Employee.LUONG_NHAN_VIEN_FULL_TIME_LINH;
            }

        } else {
            if (ngayLamThem >= 1) {
                salary = (int) (Employee.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * 800000);
            } else {
                salary = (int) Employee.LUONG_NHAN_VIEN_FULL_TIME_SEP;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n Chuc vu: " + loaiChucVu + "Luong: " + salary;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

}
