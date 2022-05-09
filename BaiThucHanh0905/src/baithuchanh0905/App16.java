package baithuchanh0905;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class App16 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Java");
        arr.add("PHP");
        arr.add("C#");
        arr.add("C++");
        System.out.println("Cac phan tu co trong mang arr la: ");
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i) + "\t");
        }
    }
}
