class Base
{
    public void M1()
    {
        System.out.println(" Parent Class Method" );
    }
}
class Derived extends Base
{
    public void M2()
    {
        System.out.println(" Child Class Method ");
    }
}
class Inheritance2 extends Derived
{
    public void M3()
    {
        System.out.println(" Grand-Child Class Method ");
    }
}
class Inheritance3 extends Inheritance2
{
    public void M4() {System.out.println(" Great-Grand-Child Class Method ");}
}
class Inheritance4 extends Inheritance3
{
    public void M5() {System.out.println(" Great-Great-Grand-Child Class Method ");}
}
class Main
{
    public static void main(String[] args)
    {
        Base d = new Base(); // creating object
        d.M1(); // print Base Class Method

        Derived b = new Derived(); // creating object
        b.M2(); // print Derived Class Method

        Inheritance2 c = new Inheritance2();//creating object
        c.M3();//Print next level of inherited class

        Inheritance3 e = new Inheritance3();
        e.M4();

        Inheritance4 f = new Inheritance4();
        f.M5();
    }
}