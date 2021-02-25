import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Implementing functional interfaces from java.util.function using lambdas");
        System.out.println("Enter number of element you want: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements: ");

        while (n>0)
        {
            int a= sc.nextInt();
            li.add(a);
            n--;
        }
        Predicate<Integer> isEven=x->x%2==0;

        Function<Integer,Integer> numberSquare=x->x*x;
        Consumer<Integer> printOut=x->System.out.println(x);
        System.out.println("Square of even number are: ");
        li.stream()
                .filter(isEven)
                .map(numberSquare)
                .forEach(printOut);
        Supplier<Integer> supplyRandom=()->{
            Random rand = new Random();
            return rand.nextInt(1000);
        };
        System.out.println("Implementing Random number Using supplier functional interface are: "+supplyRandom.get());
    }
}
