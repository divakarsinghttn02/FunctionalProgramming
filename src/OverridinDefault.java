interface Test
{

   public default void defaultMethod()
    {
        System.out.println("This is interface default method");
    }
}
public class OverridinDefault implements Test
{

    public void defaultMethod()

    {
        System.out.println("Overriding default");
    }

    public static void main(String[] args) {
        OverridinDefault obj=new OverridinDefault();

        obj.defaultMethod();


    }
}
