package baithuchanh2701;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        float a = input.nextFloat();
        
        System.out.println("Nhap he so b:");
        float b = input.nextFloat();
        
        System.out.println("Nhap he so c: ");
        float c = input.nextFloat();
        
        float delta = b*b - 4*a*c; 
        float x1, x2;
        if(a == 0){
            if(b == 0){
                System.out.println("Phuongw trinh vo nghiem");
            } else{
                System.out.println("Phuong trinh co mot nghiem duy nhat: " + "x =" + (-c/b));
            }
         }
        
         if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }  
}
    

