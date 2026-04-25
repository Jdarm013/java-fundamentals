final class Day {
    // Constant variables to store hours in a day

    final int HOURS_PER_DAY = 24;
    final int MINUTES_PER_DAY = 1440;
    // Method to display the number of hours and minutes in a day
    void displayHoursAndMinutes() {
        System.out.println("Number of hours in a day: " + HOURS_PER_DAY);
        System.out.println("Number of minutes in a day: " + MINUTES_PER_DAY);
    }
}

class Main {
    // Main method
    public static void main(String[] args) {
        Day First = new Day();
        First.displayHoursAndMinutes();
    }
}