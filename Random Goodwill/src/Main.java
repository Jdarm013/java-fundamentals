import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
    int randMessage = rand.nextInt(10);

    switch (randMessage) {
        case 0:
            System.out.println("Just a note to say I’m grateful for our friendship; it’s truly a blessing.");
            break;
        case 1:
            System.out.println("Wishing you a speedy recovery; take all the time you need to heal.");
            break;
        case 2:
            System.out.println("Congratulations on your new job! Your hard work truly deserves this success.");
            break;
        case 3:
            System.out.println("Thinking of you during this challenging time; I’m here if you need anything.");
            break;
        case 4:
            System.out.println("Happy birthday! May this year bring you joy and wonderful memories.");
            break;
        case 5:
            System.out.println("Thank you for your support; it means the world to me.");
            break;
        case 6:
            System.out.println("Wishing you all the best in your new adventure; you’ll do great!");
            break;
        case 7:
            System.out.println("I appreciate your kindness; it has made a significant difference in my life.");
            break;
        case 8:
            System.out.println("Cheers to your achievements; your dedication is inspiring!");
            break;
        case 9:
            System.out.println("Sending warm wishes for a joyful holiday season filled with love.");
            break;

    }
    }
}