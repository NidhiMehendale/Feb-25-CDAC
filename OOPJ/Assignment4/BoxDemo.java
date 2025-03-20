import java.util.Scanner;

class Box{
	double height;
	double width;
	double breadth;
	
	public Box(){
		this(0.0,0.0,0.0);
	}
	
	public Box(double height,double width,double breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	public double getVolume(){
		return height * width * breadth;
	}
	
	public double getArea(){
		return 2 * (height * width + width * breadth + height * breadth);

	}
	
	public void displayDetails(){
        System.out.println("Volume: " + getVolume());
        System.out.println("Surface Area: " + getArea());
    }

}

class BoxDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter for Box 1:");
		System.out.println("Enter height");
		double h1 = sc.nextDouble();
		
		System.out.println("Enter width");
		double w1 = sc.nextDouble();
		
		System.out.println("Enter breadth");
		double b1 = sc.nextDouble();
		
		Box box1 =new Box(h1,w1,b1);
		System.out.println("\nDetails of Box 1:");
		box1.displayDetails();
		
		System.out.println("\nEnter for Box 2:");
		System.out.println("Enter height");
		double h2 = sc.nextDouble();
		
		System.out.println("Enter width");
		double w2 = sc.nextDouble();
		
		System.out.println("Enter breadth");
		double b2 = sc.nextDouble();
		
		Box box2 =new Box(h2,w2,b2);
		System.out.println("\nDetails of Box 2:");
		box2.displayDetails();
	}
}