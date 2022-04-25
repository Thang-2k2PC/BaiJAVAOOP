package Person;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Customer extends Person{
    int balance;
    Scanner input = new Scanner(System.in);
    public Customer() {
    }

    public Customer(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhap balance: ");
        balance = input.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "balance: " + balance; 
    }

    @Override
    public void display() {
        System.out.println(this);
    }
    
}
