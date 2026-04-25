class Worker
{
    String Name;
    int age;

    //Default constructor
    public Worker()
    {
        Name = "Tony";
        age = 25;
    }

    public String getName() {
        return Name;
    }

    public int getage()
    {
        return age;
    }
    public void setage(int newage)
    {
        age = newage;
    }
}
public class Main {

    public static void main(String args[]) {
        Worker myWorker = new Worker();
        System.out.println(myWorker.getage());
        System.out.println(myWorker.Name);
    }
}