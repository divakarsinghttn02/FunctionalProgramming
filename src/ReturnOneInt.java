import java.util.Scanner;
interface ReturnOne
{
    int perform5(int x,int y);
}

public class ReturnOneInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();
        System.out.println("Enter the Second number:");
        int b= sc.nextInt();
        ReturnOne r=(int n,int m)->n;
        System.out.println("One value tha is returning is..... "+r.perform5(a,b));
    }
}
