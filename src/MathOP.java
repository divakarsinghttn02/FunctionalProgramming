import java.util.Scanner;
import java.util.function.BiFunction;


class MathOperation
{
    public int add(int a, int b) {
        return a + b;
    }


    public int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
}

public class MathOP {
    public static void main(String[] args) {
        MathOperation mo=new MathOperation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int m= sc.nextInt();
        System.out.println("Enter the first number: ");
        int n=sc.nextInt();
        BiFunction<Integer,Integer,Integer> add1=mo::add;
        System.out.println("Addition");
        System.out.println(m+" + "+n+"= "+add1.apply(m,n));
        BiFunction<Integer,Integer,Integer> sub1=mo::sub;
        System.out.println("Subtraction");
        System.out.println(m+" - "+n+"= "+sub1.apply(m,n));
        BiFunction<Integer,Integer,Integer> mul1=MathOperation::mul;
        System.out.println("Multiplication");
        System.out.println(m+" * "+n+"= "+mul1.apply(m,n));
    }
}
