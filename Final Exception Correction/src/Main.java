class Main {
    public static void main(String[ ] args)
    {
        int numberone = 9;
        int numbertwo = 0;


        try {
            System.out.println(numberone/numbertwo);
        }
        catch (Exception e)
        {
            System.out.println("You cant divide by zero! Change your integer values"); // error!
        }

    }
}