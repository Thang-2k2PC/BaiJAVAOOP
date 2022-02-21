package thuchanh2102;

/**
 *
 * @author DELL
 */
public class App55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if(i % 5 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
