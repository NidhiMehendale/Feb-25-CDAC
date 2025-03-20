import java.util.Scanner;

class Student{
	String sName;
	int[] marks = new int[3];
	double totalMarks;
	double averageMarks;
	
	public void assignValues(String sName ,int marks1,int marks2,int marks3){
		this.sName = sName;
		marks[0] = marks1;
		marks[1] = marks2;
		marks[2] = marks3;	
	}
	
	public void calculateTotalAndAverage(){
		totalMarks = marks[0] + marks[1] + marks[2]; 
		averageMarks = totalMarks / 3;
	}
	
	public void displayDetails() {
        System.out.println("Student Name: " + sName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
    }
}

class StudentDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String sname = sc.nextLine();
		
		System.out.println("Enter marks in 3 subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
			
		Student s = new Student();
		s.assignValues(sname , m1, m2 , m3);
		s.calculateTotalAndAverage();
		s.displayDetails();
	}
}