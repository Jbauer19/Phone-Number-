import java.util.Scanner;

public class NameAndNumber {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = in.nextLine();
		System.out.println("Enter Phone Number: ");
		String number = in.nextLine();
		
		String first = number.substring(0,3);
		String second = number.substring(3, 6);
		String third = number.substring(7, 10);
		
		System.out.printf("%-20s" , name);
		System.out.print("(" + first + ")" + " " + second + "-" + third);
		
		
		
		

		 
		
		
		
		
		
		

	}

}
