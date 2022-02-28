package thuchanh2102;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        int ngay = Integer.parseInt(input.nextLine());
        
        switch(ngay){
            case 0:
                System.out.println("Hom nay la chu nhat");
                break;
            case 1:
                System.out.println("Hom nay la thu hai");
                break;
            case 2:
                System.out.println("Hom nay la thu ba");
                break;
            case 3:
                System.out.println("Hm nay la thu tu");
                break;
            case 4:
                System.out.println("Hom nay la thu nam");
                break;
            case 5:
                System.out.println("Hom nay la thu sau");
                break;
            case 6:
                System.out.println("Hom nay la thu bay");
                break;
            default :
                System.err.println("So ngay trong tuann sai!!!");
                    
        }
    }
}
