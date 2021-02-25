import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenList {
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

        List<Integer> list=li.stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList());
        System.out.println("Even numbers of list are: ");
        list.stream()
                .forEach(System.out::println);


    }
}
