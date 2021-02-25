import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Firsteven {
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
        int firstNum= li.stream()
                .filter(e->e%2==0)
                .findFirst()
                .get();
        System.out.println("First even number is: "+firstNum);
    }
}
