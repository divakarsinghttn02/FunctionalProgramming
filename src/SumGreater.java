import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumGreater {
    public static void main(String[] args) {

        List<Integer> li=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements: ");

        while (n>0)
        {
            int a= sc.nextInt();
            li.add(a);
            n--;
        }
      int sum=  li.stream()
                .filter(e->e>5)
                .reduce(0,(x,y)->x+y);
        System.out.println("Sum of number greater than 5 are: "+sum);

    }
}
