class SimpleCalculator {
    static int undefined = 1 / 0;
}
public class NoClassDef {
    public static void main(String[] args) {
        try {

            SimpleCalculator calculator1 = new SimpleCalculator();
        } catch (Throwable t) {
            System.out.println(t);
        }

        SimpleCalculator calculator2 = new SimpleCalculator();
    }

}

