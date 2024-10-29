// package Basics.Day1;

public class Greatestfromtwonum {
    public static void main(String[] args) {
        String ans = greatest(12, 15);
        System.out.println(ans);

    }

    static String greatest(int num1, int num2) {
        if (num1 > num2) {
            return num1 + "is greatest";
        } else {
            return num2 + "is greatest";
        }
    }
}
