package baithuchanh2103;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PhuongTrinhBacHai {
    float a;
    float b;
    float c;

    public PhuongTrinhBacHai() {
    }

    public PhuongTrinhBacHai(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap he so a:");
        a = Float.parseFloat(input.nextLine());
        System.out.println("Nhap he so b:");
        b = Float.parseFloat(input.nextLine());
        System.out.println("Nhap he so c:");
        c = Float.parseFloat(input.nextLine());
    }
    
    public void GiaiPt(){
        float x1, x2 = 0;
        float denlta = (float) (Math.pow(b, 2) - 4 * a * c);
        if(denlta > 0){
            x1 = (float) (-b + Math.sqrt(denlta)) / (2*a);
            x2 = (float) (-b - Math.sqrt(denlta)) / (2*a);
            System.out.format("Phuong trinh co hai Nghiem pb: x1 = %f , x2 = %f", x1, x2 );
        }
        if(denlta < 0){
            System.out.println("Phuong tring vo nghiem");
        }
        if(denlta == 0){
            System.out.format("Phuong trinh co nghiem kep x = %f", (-b/c));
        }
    }
    
}
