package baithuchanh2103;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Person {
    String PersonID, PersonName, Address;
    String Gender;
    public Person(){
    }
    public Person(String PersonID, String PersonName, String Address, String Gender){
        this. PersonID = PersonID;
        this.PersonName = PersonName;
        this.Address = Address;
        this.Gender = Gender;
    }

    public void Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Id :");
        PersonID = input.nextLine();
        System.out.println("Nhap ten:");
        PersonName = input.nextLine();
        System.out.println("Nhap dia chi:");
        Address = input.nextLine();
        System.out.println("Nhap Gender:");
        Gender = input.nextLine();
    }
    public void display(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Person{" + "PersonID=" + PersonID + ", PersonName=" + PersonName + ", Address=" + Address + ", Gender=" + Gender + '}';
    }
   
   
}
