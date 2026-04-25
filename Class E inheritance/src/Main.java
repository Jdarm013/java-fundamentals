class A
{
    public void methodA()
    {
        System.out.println("method of Class A");
    }
}
class B extends A
{
    public void methodB()
    {
        System.out.println("method of Class B");
    }
}
class C extends A
{
    public void methodC()
    {
        System.out.println("method of Class C");
    }
}
class D extends A
{
    public void methodD()
    {
        System.out.println("method of Class D");
    }
}
class E extends A
{
    public void methodE()
    {
        System.out.println("method of Class E");
    }
}
class Main
{
    public static void main(String args[])
    {
        B obj1 = new B();
        C obj2 = new C();
        D obj3 = new D();
        E obj4 = new E();
        //All classes can access the method of class A
        obj1.methodB();
        obj2.methodC();
        obj3.methodD();
        obj4.methodE();
    }
}