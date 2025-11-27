public class Main {
    public static void main(String[] args) {

        ExceptionGenerator eg = new ExceptionGenerator();

        try {
            eg.generateNullPointer();
        } catch (NullPointerException ex) {
            System.out.println("A NullPointerException occurred!");
            ex.printStackTrace();
            System.out.println(ex.toString());
        }
    }
}
