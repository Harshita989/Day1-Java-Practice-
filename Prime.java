import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = 2;
        if (num == 1) {
            System.out.println("Prime");
        }
        if (div < num) {
            if (num % div == 0) {
                System.out.println("Not prime");
                div++;
            } else {
                System.out.println("Prime");
            }

        }
    }

}