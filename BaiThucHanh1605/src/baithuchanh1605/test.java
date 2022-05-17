
import java.util.HashSet;
import java.util.Scanner;

public class test {

    public static void main(String[] args) throws Exception {
        int number;
        int n;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);

        System.out.println("Cac phan tu trong hashSetInteger");
        System.out.println(hashSetInteger);
        System.out.println("Nhap so phan tu can them:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            number = sc.nextInt();
            if (!hashSetInteger.contains(number)) {
                hashSetInteger.add(number);
            }
        }
        System.out.println("them thanh cong");
        System.out.println("Cac phan tu trong hashSetInteger sau khi duoc them");
        System.out.println(hashSetInteger);

    }
}
