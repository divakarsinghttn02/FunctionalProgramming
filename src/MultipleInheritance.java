interface Test1Interface
{
    default void show()
    {
        System.out.println("Default Test1Interface");
    }
}
interface Test2Interface
{
    default void show()
    {
        System.out.println("Default Test2Interface");
    }
}
public class MultipleInheritance implements Test1Interface,Test2Interface{
    public static void main(String[] args) {
        MultipleInheritance obj=new MultipleInheritance();
        obj.show();

    }

    @Override
    public void show() {


            Test1Interface.super.show();
            Test2Interface.super.show();


    }
}
