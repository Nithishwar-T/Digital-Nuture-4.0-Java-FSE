public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Starting inventory system");
        logger2.log("User logged in");

        if (logger1 == logger2) {
            System.out.println("Same Logger instance used ");
        } else {
            System.out.println("Different Logger instances ");
        }
    }
}
