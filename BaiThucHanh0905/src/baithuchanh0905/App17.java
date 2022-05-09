package baithuchanh0905;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class App17 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(7);
        arr.add(1);
        arr.add(9);
        System.out.println("Cac phan tu co trog mang arr la: ");
        for (Integer integer : arr) {
            System.out.println(integer + "\t");
        }
        
    }
}
