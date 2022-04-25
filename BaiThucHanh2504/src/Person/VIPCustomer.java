package Person;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class VIPCustomer extends Person {
    int balance;
    double discount;
    Scanner input = new Scanner(System.in);
    public VIPCustomer(int balance, double discount) {
        this.balance = balance;
        this.discount = discount;
    }

    public VIPCustomer(int balance, double discount, String name, int age, String address) {
        super(name, age, address);
        this.balance = balance;
        this.discount = discount;
    }

    @Override
    public void input() {
        super.input(); 
        System.out.println("Nhap balance: ");
        balance = input.nextInt();
        System.out.println("Nhap discount: ");
        discount = input.nextInt();
        balance =(int) (balance - (balance * discount / 100));
    }

    @Override
    public String toString() {
        return super.toString() + "balance: " + balance + "discount: " + discount; 
    }

    @Override
    public void display() {
        System.out.println(this);
    }
    
    
}
