class Animal
{
    public Animal()
    {
        System.out.println("A new animal has been created!");
    }
    public void sleep()
    {
        System.out.println("An animal sleeps...");
    }
    public void eat()
    {
        System.out.println("An animal eats...");
    }
}
class Cat extends Animal
{
    public Cat()
    {
        super();
        System.out.println("A new cat has been created!");
    }
    public void sleep()
    {
        System.out.println("A cat sleeps...");
    }
    public void purr()
    {
        System.out.println("A cat purrs...");
    }
    public void eat()
    {
        System.out.println("An cat eats...");
    }
}
class Ferret extends Animal
{
    public Ferret()
    {
        super();
        System.out.println("A new Ferret has been created!");
    }
    public void sleep()
    {
        System.out.println("A Ferret sleeps...");
    }
    public void plays()
    {
        System.out.println("A Ferret plays...");
    }
    public void eat()
    {
        System.out.println("A Ferret eats...");
    }
}
public class Main
{
    public static void main(String args[])
    {
        Cat demo = new Cat();
        demo.eat();
        demo.sleep();
        demo.purr();

        Ferret demo2 = new Ferret();
        demo2.eat();
        demo2.sleep();
        demo2.plays();
    }
}
