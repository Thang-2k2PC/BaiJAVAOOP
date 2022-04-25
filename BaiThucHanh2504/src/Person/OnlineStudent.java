package Person;
import Person.Student;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class OnlineStudent extends Student {
    String diemdanhOnl;

    public OnlineStudent() {
    }

    public OnlineStudent(String diemdanhOnl) {
        this.diemdanhOnl = diemdanhOnl;
    }

    public OnlineStudent(String diemdanhOnl, String Masv, String lop) {
        super(Masv, lop);
        this.diemdanhOnl = diemdanhOnl;
    }

    public OnlineStudent(String diemdanhOnl, String name, int age, String address, String Masv, String lop) {
        super(name, age, address, Masv, lop);
        this.diemdanhOnl = diemdanhOnl;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input();
        System.out.println("diem danh: " );
        diemdanhOnl = input.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "diemdanhOnl : " + diemdanhOnl; 
    }

    @Override
    public void display() {
        System.out.println(this);
    }
    
    public String getDiemdanh() {
        return diemdanhOnl;
    }

    public void setDiemdanh(String diemdanh) {
        this.diemdanhOnl = diemdanh;
    }
    
    
}
