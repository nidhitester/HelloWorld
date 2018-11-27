import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        float sum=0;
        System.out.println("enter the number");
float num=s.nextFloat();
    for(int i=1;i<=num;i++){
        sum=1+1/i;
        System.out.println("sum of the series 1+1/2+1/3+1/4.....1/n is"+ sum);
}}}
