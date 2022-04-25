package Person;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Person {

    String name, address;
    int age;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = input.nextLine();
        System.out.println("Nhap tuoi: ");
        age = input.nextInt();
        System.out.println("Nhap address: ");
        address = input.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", age=" + age + '}';
    }

    public void display() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
