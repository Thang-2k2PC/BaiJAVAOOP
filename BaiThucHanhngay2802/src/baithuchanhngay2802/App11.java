package baithuchanhngay2802;

/**
 *
 * @author DELL
 */
public class App11 {

    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i <= 200; ++i) {
            for (j = 0; j <= 100; ++j) {
                for (k = 0; k <= 40; ++k) {
                    if (i * 10 + j * 20 + k * 50 == 200) {
                        System.out.printf("\nCan %d to 10k, va %d to 20k, va %d to 50k", i, j, k);
                    }
                }
            }
        }
    }
}
