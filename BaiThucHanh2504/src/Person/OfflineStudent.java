package Person;
import Person.Student;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class OfflineStudent extends Student {
    String teacher;
    int mark;

    public OfflineStudent(String teacher, int mark) {
        this.teacher = teacher;
        this.mark = mark;
    }

    public OfflineStudent(String teacher, int mark, String Masv, String lop) {
        super(Masv, lop);
        this.teacher = teacher;
        this.mark = mark;
    }

    public OfflineStudent(String teacher, int mark, String name, int age, String address, String Masv, String lop) {
        super(name, age, address, Masv, lop);
        this.teacher = teacher;
        this.mark = mark;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input(); 
        System.out.println("Ten teacher: ");
        teacher = input.nextLine();
        System.out.println("Nhap diem: ");
        mark = input.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "Mark: " + mark +"Teacher bo mon: "  + teacher ; 
    }

    @Override
    public void display() {
        System.out.println("this");
    }
    
    
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    
    public String getTeacher(){
        return teacher;
    }
}
