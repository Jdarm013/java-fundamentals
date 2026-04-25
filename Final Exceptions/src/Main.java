import java.io.*;

class Main {
    public static void main(String[] args) {
        try {


            int res = 10 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println( "What goes here:An Error message, either custom or default, that lets the user know they cannot divide by 0");
        }

        System.out.println("Will this always execute? Yes it is outside the try catch block, which the exception caught and handled anyway, and its the only other code in the Main section of the code it will always execute.");
    }
}

