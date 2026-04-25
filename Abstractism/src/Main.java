// Abstract class
abstract class Animal
{
    // Regular method
    public void sleep()
    {
        System.out.println("Zzz");
    }
    public void wakeUp()
    {
        System.out.println("Oink Oink");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal
{
    public void sing()
    {
        System.out.println("hee");
    }
}
class Main {
    public static void main(String[] args)
    {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.sleep();
        myPig.sing();
        myPig.wakeUp();
    }
}