
 interface ExeFunctionalInterface {
     public void print();

     static void printS() {
         System.out.println("Im a static method");
     }

     default void printD() {
         System.out.println("I'm in default method");
     }

}

public class StaticAndDefault implements ExeFunctionalInterface {
   public void print()
    {
        System.out.println("Overriding method");
    }
    public static void main(String[] args) {
       StaticAndDefault d=new StaticAndDefault();


        ExeFunctionalInterface.printS();
       d.printD();

    }
}

