import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a,b,c,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number upto which you want to print fibonacci series");

        n=sc.nextInt();
        a=0;//first number
        b=1;//second number
//n=user input
        System.out.println(a);
        System.out.println(b);

        for(int i=2;i<n;i++){
            c=a+b;//sum of first and second number
            System.out.println(c);
            a=b;//change value
            b=c;
        }











    }
}
