import java.util.Scanner;

interface Greater
{
    boolean calc(int a,int b);
}
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();;
        Greater s=(int x,int y)->x>y;
        boolean f=s.calc(a,b);
        if(f)
        {
            System.out.println("first number: "+a+" greater.");
        }
        else
        {
            System.out.println("Second number: "+b+" greater.");
        }

    }
}
