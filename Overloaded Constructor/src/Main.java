class Person
{
    int age;
    int id;
    String name;
    public Person()
    {
        age = 20;
        name="Toby";
        id = 3280;
    }
    public Person(int i, String n)
    {
        age = 20;
        id = i;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getid()
    {
        return id;
    }
    public void setid(int newid)
    {
        id = newid;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String newname)
    {
        name = newname;
    }
}
public class Main{

    public static void main(String[] args)
    {
//object creation
        Person p = new Person();
        System.out.println("Default Constructor values: ");
        System.out.println("Id : "+p.getid()+ "\nPerson Name : "+p.getname()+ "\nPerson Age: "+p.getAge());
        System.out.println();
        System.out.println("Constructor values:");
        Person p1 = new Person(1010, "David");
        System.out.println("Id : "+p1.getid()+ "\nPerson Name : "+p1.getname()+"\nPerson Age : "+p1.getAge());
    }
}