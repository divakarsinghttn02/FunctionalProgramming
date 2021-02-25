import java.util.Scanner;

interface Incremental
{
    int perform1(int n);
}
public class IncrementVal1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        Incremental i=(int x)->x+1;
        a=i.perform1(a);
        System.out.println("Incremented value is: "+a);


    }
}
