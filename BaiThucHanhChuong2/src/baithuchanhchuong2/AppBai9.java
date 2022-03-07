package baithuchanhchuong2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
//Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả số, ký tự thường 
//và ký tự hoa từ bàn phím. Sau đó đếm và in ra số ký tự thường và ký tự hoa và số có trong chuỗi đó.
public class AppBai9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String str = input.nextLine();
        int counter[] = new int[256];
        int len = str.length();
        
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;
        char array[] = new char[str.length()];
        
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
        }
    }
}
