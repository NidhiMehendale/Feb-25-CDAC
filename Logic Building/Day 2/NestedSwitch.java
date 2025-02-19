import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1-7:  ");
        int day = scanner.nextInt();
        
        switch (day) {
            case 1:
                System.out.print("Monday - ");
                switch (1) {
			 case 1: 
				System.out.println("Weekday"); 
		}
                break;
            case 2:
                System.out.print("Tuesday - ");
                switch (1) { 
			case 1: 
				System.out.println("Weekday"); 
		}
                break;
            case 3:
                System.out.print("Wednesday - ");
                switch (1) { 
			case 1: 
				System.out.println("Weekday"); 
		}
                break;
            case 4:
                System.out.print("Thursday - ");
                switch (1) { 
			case 1: 
				System.out.println("Weekday"); 
		}
                break;
            case 5:
                System.out.print("Friday - ");
                switch (1) {
			 case 1: 
				System.out.println("Weekday"); 
		}
                break;
            case 6:
                System.out.print("Saturday - ");
                switch (1) {
			 case 1: 
				System.out.println("Weekend"); }
               		 break;
            case 7:
                System.out.print("Sunday - ");
                switch (1) {
			 case 1: System.out.println("Weekend");
		 }
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
        
        scanner.close();
    }
}
