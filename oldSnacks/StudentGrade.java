import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many students do you have?");
        int numberOfStudents = scan.nextInt();

        System.out.println("How many subjects do they offer?");
        int numberOfSubjects = scan.nextInt();

        System.out.println("Saving >>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
        System.out.println();

        String[] subjects = new String[numberOfSubjects];
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the name of subject " + (i + 1));
            subjects[i] = scan.next();

        }

        int[][] listOfScores = new int[numberOfStudents][numberOfSubjects];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Entering scores for student " + (i + 1));
            for (int j = 0; j < numberOfSubjects; j++) {
                int score;
                do {
                    System.out.println("Enter score for " + subjects[j] + " for student " + (i + 1));
                    while (!scan.hasNextInt()) {
                        System.out.println("Please enter a valid integer score.");
                        scan.next();
                    }
                    score = scan.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Enter a valid score (within 0 to 100)");
                    }
                } while (score < 0 || score > 100);
                listOfScores[i][j] = score;
                System.out.println("Saving >>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully");
                System.out.println();
            }
        }

        double[] averages = new double[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            int total = 0;
            for (int j = 0; j < numberOfSubjects; j++) {
                total += listOfScores[i][j];
            }
            averages[i] = (double) total / numberOfSubjects;
        }

        int[] positions = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents;  i++) {
            positions[i] = i + 1;
        }
        for (int i = 0; i < numberOfStudents - 1;  i++) {
            for (int j = 0; j < numberOfStudents - i - 1; j++) {
                if (averages[j] < averages[j + 1]) {
                
                    double tempAverage = averages[j];
                    averages[j] = averages[j + 1];
                    averages[j + 1] = tempAverage;
                
                    int tempPosition = positions[j];
                    positions[j] = positions[j + 1];
                    positions[j + 1] = tempPosition;
                }
            }
        }

        System.out.println("================================================================================");
        System.out.print("STUDENT\t\t\t");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("SUB" + (i + 1) + "\t");
        }
        System.out.println("Total\tAverage\tPosition");
        System.out.println("================================================================================");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + positions[i] + "\t\t");
            int total = 0;
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print(listOfScores[positions[i] - 1][j] + "\t");
                total += listOfScores[positions[i] - 1][j];
            }
            System.out.printf("%d\t%.2f\t%d%n", total, averages[i], i + 1);
        }
        System.out.println("================================================================================");
        System.out.print("=================================================================================");
    }
}
