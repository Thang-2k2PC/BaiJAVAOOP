package baithuchanh0905;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author DELL
 */
public class App19 {
    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('a');
        arr.add('e');
        arr.add('b');
        arr.add('c');
        ListIterator<Character> listIterator = arr.listIterator();
        System.out.println("Cac phan tu co trong mang arrListChar la : ");
        while (listIterator.hasNext()) {            
            System.out.println(listIterator.next() + "\t");
        }
    }
}
