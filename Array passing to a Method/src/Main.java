
//importing scanner
import java.util.Scanner;


public class Main {
    //Method to print the array
    public static void printArray(int[] arr) {
        System.out.print("Printing Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array element "+ (i+1) + ": " + arr[i]);
        }
    }
    //basic framework
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//getting the numbers input to variables from the user
        System.out.println("Enter the amount of numbers in your Array:");
        int size = input.nextInt();

        //creating an array of the specificied size
        int[] userInput = new int[size];

        //loop to get user inpput for the array
        System.out.println("Enter "+size+" numbers");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+(i+1)+" number");
            userInput[i] = input.nextInt();
        }
       input.close();

        //pass the array to the method
        printArray(userInput);
        }

    }


