import java.util.Scanner ;
class StudentPassOrFail{
	public static void main (String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter marks for Subject 1: ");
		int subject1 = scanner.nextInt();

     		System.out.print("Enter marks for Subject 2: ");
        	 int subject2 = scanner.nextInt();

        	 System.out.print("Enter marks for Subject 3: ");
                 int subject3 = scanner.nextInt();

		  if (subject1>=40 && subject2>=40 && subject3>=40){
			System.out.println("The Student passed in three subject");
		   }else{
			System.out.println("The student is fail");
		   }
	}
}
