package Person;

import Person.Employee;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PartTimeEmployee extends Employee{
     Scanner input = new Scanner(System.in);
    int giolamviec;

    @Override
    public void input() {
        super.input(); 
        System.out.println("Nhap so gio lam viec: ");
        giolamviec = input.nextInt();
        salary = 200000 * giolamviec;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGio lam viec: " + giolamviec;
    }

    @Override
    public void display() {
        System.out.println(this);
        System.out.printf("NHan vien thoi vu: " + "\nLuong: %d trieu dong" , salary);
    }
    
     public PartTimeEmployee() {
    }

    public PartTimeEmployee(int giolamviec) {
        this.giolamviec = giolamviec;
    }

    public PartTimeEmployee(int giolamviec, String MaNV) {
        super(MaNV);
        this.giolamviec = giolamviec;
    }

    public PartTimeEmployee(int giolamviec, String MaNV, int salary, String name, int age, String address) {
        super(MaNV, salary, name, age, address);
        this.giolamviec = giolamviec;
    }
}
