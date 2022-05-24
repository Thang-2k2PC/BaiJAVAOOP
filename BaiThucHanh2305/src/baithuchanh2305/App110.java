package baithuchanh2305;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class App110 {

    static void Max(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).compareTo(max) > 0) {
                max = arr.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong mmang ArrayList la : " + max);
    }

    static void Remove(ArrayList<Integer> arr) {
        Scanner vc = new Scanner(System.in);
        System.out.println("Nhap phan tu xoa:");
        int so = vc.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == so) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }

    static void Sort(ArrayList<Integer> arr) {
        Collections.sort(arr);
        arr.forEach((t) -> {
            System.out.println(t);
        });
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Nhap N phan tu: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            number = sc.nextInt();
            arr.add(number);
        }
        Max(arr);
        Remove(arr);
        Sort(arr);
    }
}
