import java.util.Scanner;
//cube of number
public class Cube1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int n=s.nextInt();
        int a=0;
        for(int i=1;i<=n;i++){
            a=i*i*i;
            System.out.println(+a);

            }
        }


    }


