import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" number divisible by 3 are -");
        int num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.print(+i+" ,");
        }
        System.out.println(" number divisible by 5 are-");
        int num1 = s.nextInt();
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                System.out.println(+i);

            }
        }
    }
}