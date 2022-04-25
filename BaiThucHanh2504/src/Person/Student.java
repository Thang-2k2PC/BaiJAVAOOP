package Person;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Student extends Person{
    String Masv ;
    String lop;
    Scanner input = new Scanner(System.in);

    public Student() {
    }

    public Student(String Masv, String lop) {
        this.Masv = Masv;
        this.lop = lop;
    }

    public Student( String name, int age, String address,String Masv, String lop) {
        super(name, age, address);
        this.Masv = Masv;
        this.lop = lop;
    }
    
   
    public void Run(){
        System.out.println("Di chuyen bang xe may");
    }

    @Override
    public void input() {
        super.input(); 
        System.out.println("Nhap Masv: ");
        Masv = input.nextLine();
        System.out.println("Nhap Lop: ");
        lop = input.nextLine();
        

    }

    

    @Override
    public String toString() {
        return super.toString() + "Masv : " + Masv + "Lop: " + lop; 
    }

    @Override
    public void display() {
        System.out.println(this);
    }
    
    
}
