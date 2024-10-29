
// package Basics.Day1;
import java.util.*;

public class Averageof25Sub {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the scores");
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 25; i++) {
            int score = sc.nextInt();
            sum = sum + score;
        }
        float avg = sum / 25;
        System.out.println(avg);
    }
}
