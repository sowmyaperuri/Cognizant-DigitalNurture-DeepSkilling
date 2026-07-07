public class SingletonDemo {

    public static void main(String[] args) {

        Logger L1 = Logger.getInstance();
        Logger L2 = Logger.getInstance();

        L1.log("First message");
        L2.log("Second message");

        System.out.println("Are both instances same? " + (L1 == L2));
    }
}