package baithuchanhchuong2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AppBai11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang:");
        int n = input.nextInt();
        int[]arr = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        int a = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        for(int i = 0; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
