
public class Practice7 {

    public static void main(String[] args) {

        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        System.out.println("Report Value: " + (double) solvedProblems);
        System.out.println("Whole Percentage: " + (int) exactPercentage);

        double average = (double) solvedProblems / practiceDays;
        System.out.println("Average Per Day: " + average);

        System.out.println("Daily Target Reached: " + (average >= 9.0));
    }
}
