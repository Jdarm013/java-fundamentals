import java.util.Vector;

class makeVect{

    public static Vector<Integer> vectorElementsList() {
        // Create a Vector
        Vector<Integer> myVector = new Vector<>();

        // Input 4 values into the Vector
        myVector.add(10);
        myVector.add(20);
        myVector.add(30);
        myVector.add(40);

        System.out.println("Initial Vector: " + myVector);

       // Remove 1 value
        myVector.remove(2);
        System.out.println("After Removal: " + myVector);

        // Return the modified Vector
        return myVector;
    }

    public static void main(String[] args) {

        // Calling the method in the main program
        System.out.println(makeVect.vectorElementsList());

    }
}