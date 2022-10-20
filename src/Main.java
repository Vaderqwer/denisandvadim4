import java.util.Scanner;
import java.util.;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите k");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        Double[] n1 = new Double[20];
        Double n6 = 101.0, n7 = 101.0;
        for (int n5 = 0; n5 < 20; n5++) {
            n1[n5] = Math.random() (100) + 0;
            System.out.println((n5 + 1) + ")" + n1[n5]);
        }
        for (int n4 = 0; n4 < k;n4++) {
            for (int n2 = 0; n2 < 20;n2++) {
                if (n1[n2] < n6) {
                    n6 = n1[n2];
                    n7 = n6;
                }
            }
            for (int n3 = 0; n3 < 20; n3++) {
                if (n1[n3].equals(n7)) {
                    n1[n3] = 1000.0;
                    System.out.println("Наименьшее " + n6);
                    n6= 101.0;
                }
            }
        }
    }
}
