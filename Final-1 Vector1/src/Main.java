import java.util.Vector;
//vector creation method
public class VectorExample{


    public static Vector<Integer> vectorElementsList() {
        // Create a Vector to hold Integer objects
        Vector<Integer> myVector = new Vector<>();

        // Input 4 values into the Vector
        myVector.add(10);
        myVector.add(20);
        myVector.add(30);
        myVector.add(40);

        // Return the  Vector
        return myVector;
    }


}
public static void main(String[] args) {
    // CALL THE RENAMED METHOD HERE:
    Vector<Integer> resultVector = VectorExample.vectorElementsList();

    // Print the returned Vector
    System.out.println("The Vector is: " + resultVector);
}
