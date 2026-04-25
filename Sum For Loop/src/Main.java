//Joseph Darmiento 09/13/25
import java.util.Scanner;//to read input
//basic framework
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;//intitialize variable to store sum

        System.out.println("Enter 10 numbers to find the total sum.( Type -6 to calculate )");

        //for loop that will loop 10 times or end if -6 is entered
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number: " + i + ":");
            int number = input.nextInt();// reads input number from user
            //exits loop if -6 is input
            if (number == -6){
                break;
            }
            sum += number;//takes the input number and adds it to the previous sum
            }
            System.out.println("The total of the numbers you entered is: " + sum);//output message for end of program
            input.close();//closes scanner
        }
    }



