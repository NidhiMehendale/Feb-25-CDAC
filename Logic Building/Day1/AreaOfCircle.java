import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the radius: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

   	System.out.printf("Area of the circle: %.5f\n", area);

        scanner.close();
    }
}
