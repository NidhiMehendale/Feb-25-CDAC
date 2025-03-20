import java.util.Scanner;

class Room{
	double height;
	double width;
	double breadth;
	
	public Room(){
		this(0.0,0.0,0.0);
	}
	
	public Room(double height,double width,double breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	public double volume(){
		return height * width * breadth;
	}
	
}

class RoomDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		double h = sc.nextDouble();
		
		System.out.println("Enter width");
		double w = sc.nextDouble();
		
		System.out.println("Enter breadth");
		double b = sc.nextDouble();
		
		Room room = new Room(h,w,b);
		System.out.println("Volume is: "room.volume());
			
	}
}