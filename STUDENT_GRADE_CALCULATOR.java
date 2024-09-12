import java.util.Scanner;
public class STUDENT_GRADE_CALCULATOR {
    public static void main(String[]args){
                Scanner scanner = new Scanner(System.in);
                // Input the number of subjects
                System.out.print("Enter the number of subjects: ");
                int numberOfSubjects = scanner.nextInt();
                // Array to store the marks for each subject
                int[] marks = new int[numberOfSubjects];
                int totalMarks = 0;
                // Input marks for each subject and calculate the total marks
                for (int i = 0; i < numberOfSubjects; i++) {
                    System.out.print("Enter the marks for subject " + (i + 1) + " (out of 100): ");
                    marks[i] = scanner.nextInt();
                    totalMarks += marks[i];
                }
                // Calculate the average percentage
                double averagePercentage = (double) totalMarks / numberOfSubjects;
                // Determine the grade based on the average percentage
                char grade;
                if (averagePercentage >= 90) {
                    grade = 'A';
                } else if (averagePercentage >= 80) {
                    grade = 'B';
                } else if (averagePercentage >= 70) {
                    grade = 'C';
                } else if (averagePercentage >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
                // Display the results
                System.out.println("\nResults:");
                System.out.println("Total Marks: " + totalMarks + " out of " + (numberOfSubjects * 100));
                System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
                System.out.println("Grade: " + grade);
                scanner.close();
            }
        }