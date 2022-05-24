package baithuchanh2305;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class App111 {

    static void TrungBinh(LinkedList<Integer> linked) {
        int tb = 0, tong = 0, count = 0;
        for (int i = 0; i < linked.size(); i++) {
            if (linked.get(i) % 2 == 0) {
                tong += linked.get(i);
                count++;
            }
        }
        tb = tong / count;
        System.out.println(tb);
    }

    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Nhap N phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            number = sc.nextInt();
            linked.add(number);
        }
        TrungBinh(linked);
    }
}
