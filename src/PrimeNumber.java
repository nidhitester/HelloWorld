import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        prim(i);


    }

    private static void prim(int i) {
        if (i == 2 || i == 3) {
            System.out.println(i + "is a prime number");

        } else if (i == 5 || i == 7) {
            System.out.println(i + "is a prime number");

        } else if (i % 2 == 0 || i % 3 == 0) {
            System.out.println(i + "is not a prime number");
        } else if (i % 5 == 0 || i % 7 == 0) {
            System.out.println(i + "is not a prime number");
        } else {
            System.out.println(i + "is a prime number");
        }
    }
}