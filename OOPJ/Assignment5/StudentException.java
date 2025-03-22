import java.util.InputMismatchException;
import java.util.Scanner;

class Student {

    private String name;
    private int rollNo;
    private double[] marks = new double[5];
    private double average;
    private char grade;


    public Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new IllegalArgumentException("Invalid mark: " + marks[i] + ". Marks should be between 0 and 100.");
            }
        }
        this.marks = marks;
    }

 
    public void calculateAverage(){
        double sum = 0;
        for(double mark : marks) {
            sum += mark;
        }
        average = sum / marks.length;
    }


    public void calculateGrade() {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayStudentInfo() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();
            double[] marks = new double[5];
            System.out.println("Enter marks for 5 subjects (0 - 100):");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = sc.nextDouble();

                if (marks[i] < 0 || marks[i] > 100) {
                    throw new IllegalArgumentException("Invalid mark: " + marks[i] + ". Marks should be between 0 and 100.");
                }
            }
			
            Student student = new Student(name, rollNo, marks);
            student.calculateAverage();
            student.calculateGrade();
            student.displayStudentInfo();
        }
  
        catch(InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numeric values for roll number and marks.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
