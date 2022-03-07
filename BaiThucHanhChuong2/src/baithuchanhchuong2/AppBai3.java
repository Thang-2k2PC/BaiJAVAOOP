package baithuchanhchuong2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AppBai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = input.nextLine() ;
        System.out.println("Nhap tuoi: ");
        int age = input.nextInt();
        if(age < 16){
            System.out.format("Ban %s o do tuoi vi thanh nien", name);
        }else if(age >= 16 && age < 18){
            System.out.printf("Ban %s o do tuoi truong thanh");
        }else System.out.printf("Ban %s da gia", name);
    }
}
