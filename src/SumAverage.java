import java.util.Scanner;

public class SumAverage {
    //input 5 no from key board and find their sum and average
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double sum=0,temp,avg;
        System.out.println("how many number you want to enter");
        int num=s.nextInt();

        for (int i=1;i<=num;i++){
            System.out.println("enter"+i+"num");
            temp =s.nextDouble();
            sum=sum+temp;

    }
        System.out.println("sum of all numbers is"+ sum);
        avg = sum/num;
        System.out.println("average of all numbers is"+avg);

}}
