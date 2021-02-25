import java.util.Locale;
import java.util.Scanner;
interface UpperCase
{
    String perform3(String x);

}

public class ConvertUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str1=sc.nextLine();
        UpperCase y=(String n)->n.toUpperCase(Locale.ROOT);
        str1=y.perform3(str1);
        System.out.println("String in Upper case is: "+str1);
    }
}
