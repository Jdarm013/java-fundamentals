public class Main {
    public static void main(String[] args) {
        int numerator = 13;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("This is the result " + result);
        }
        catch (ArithmeticException e) {

        System.err.println("Dividing by zero is IMPOSSIBLE!!");}
    }
    }