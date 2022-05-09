package baithuchanh0905;

import java.util.LinkedList;

/**
 *
 * @author DELL
 */
public class App36 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");
        System.out.println("vi du su dung phuong thuc add All()");
        System.out.println("----------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA:");
        showList(listA);
        
        System.out.println("\nVi du su dung phuong thuc retainAll()");
        System.out.println("-----------");
        
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        
        listA.retainAll(listB);
        System.out.println("listA:");
        showList(listA);
        
        System.out.println("\n Vi du su dung phuong thuc removeAll()");
        System.out.println("-----------");
        list.removeAll(listB);
        System.out.println("list:");
        showList(list);
    }
    
    public static void showList(LinkedList<String> list){
        for (String str : list) {
            System.out.println("\t" + str + ", ");
        }
        System.out.println();
    }
}
