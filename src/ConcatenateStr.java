import java.util.Scanner;

interface ConStr
{
    String perform2(String s1,String s2);
}
public class ConcatenateStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1=sc.nextLine();
        System.out.println("Enter the second String");
        String str2=sc.nextLine();
        ConStr s=(String s3,String s4)->s3+" "+s4;
        str1=s.perform2(str1,str2);
        System.out.println("Concatenated String is: "+str1);
    }
}
