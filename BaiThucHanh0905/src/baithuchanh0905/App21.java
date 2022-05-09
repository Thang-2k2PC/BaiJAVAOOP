package baithuchanh0905;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class App21 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>(3);
        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("Orange");
        color.remove("Green");
        color.add("Pink");
        color.add("Yellow");
        
        System.out.println(color.get(1));
        System.out.println(color.contains("Orange"));
        System.out.println(color.size());
        System.out.println(color);
    }
}
