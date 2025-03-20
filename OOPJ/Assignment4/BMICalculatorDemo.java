import java.util.Scanner;

class BMICalculator{
	double height;
	double weight;
	
	public BMICalculator(double height,double weight){
		this.height = height;
		this.weight = weight;
	}
	
	public double getHeight() {
        return height;
    }
	
	public void setHeight(double height) {
        this.height = height;
    }
	
	public double getWeight() {
        return weight;
    }
	
	public void setWeight(double weight) {
        this.weight = weight;
    }
	
	public double calculateBMI() {
        return weight / (height * height);
    }
	
	void display(double ans){
		System.out.printf("BMI: %.2f",ans);
	}

}

class BMICalculatorDemo{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your height in meters: ");
        double h = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double w = scanner.nextDouble();
		
		BMICalculator bmiCal = new BMICalculator(h,w);
		bmiCal.setHeight(h);
		bmiCal.setWeight(w);
		double ans = bmiCal.calculateBMI();
		
		bmiCal.display(ans);
		
		


	}
}