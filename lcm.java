import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        List<Integer> h = new ArrayList<>();
        int lcm;
        while (true) {

            while (true) {
                System.out.println("enter number to be lcm  ");

                int i = scanner.nextInt();
                list.add(i);
                System.out.println("exit for 1");
                i = scanner.nextInt();
                if (i == 1) {
                    break;
                } else {

                }
            }

            int o, u = 0, c = 0, min, max, lc = 0;
            c = list.size();
            o = 0;
            System.out.println("all element to be lcm");

            for (int j = 0; j <= (c - 1); j++) {
                System.out.println(list.get(j));
            }
            for (int j = 0; j <= (c - 1); j++) {

                for (int p = 0; p <= (c - 1); p++) {
                    if (list.get(j) > list.get(p)) {
                        min = list.get(p);
                        max = list.get(j);
                    } else {
                        min = list.get(j);
                        max = list.get(p);
                    }
                    for (int k = 0; k < c + 2; k++) {
                        int x = k * max;
                        if (x % min == 0) {
                            lc = x;
                            lcm = lc;
                        }
                    }
                }
            }

            System.out.println("LCM of the given array of numbers : " + lc);

            System.out.println("exit for 1");
            int y = scanner.nextInt();
            if (y == 1) {
                break;
            } else {

            }
            list.clear();

        }

    }
}
