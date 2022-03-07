package baithuchanh0703;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = input.nextInt();
        int sum = 0;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap phan tu arr[%d] = ", i);
            arr[i] = input.nextInt();
        }
        for (int x : arr) {
            if(x % 2 == 0){
                sum += x;
            }
        }
        System.out.println("Sum =" + sum);
    }

}
