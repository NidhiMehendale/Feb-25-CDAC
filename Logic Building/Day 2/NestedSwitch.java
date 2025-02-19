import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1-7: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It's a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It's a weekend.");
                        break;
                }
                break;
            case 2:
                System.out.println("Tuesday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It's a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It's a weekend.");
                        break;
                }
                break;
            case 3:
                System.out.println("Wednesday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It's a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It's a weekend.");
                        break;
                }
                break;
            case 4:
                System.out.println("Thursday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It's a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It's a weekend.");
                        break;
                }
                break;
            case 5:
                System.out.println("Friday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It's a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It's a weekend.");
                        break;
                }
                break;
            case 6:
                System.out.println("Saturday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It's a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It's a weekend.");
                        break;
                }
                break;
            case 7:
                System.out.println("Sunday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It's a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It's a weekend.");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }

        scanner.close();
    }
}