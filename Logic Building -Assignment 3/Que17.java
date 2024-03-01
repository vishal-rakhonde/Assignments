/*17. Write a Java program to display the name of a month based on its number. The program
should ask the user to enter a number (1 to 12) representing a month and then use a switch-case
statement to display the name of the corresponding month.*/
import java.util.Scanner;
class Que17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to know month.");
		
		int num=sc.nextInt();
		switch(num){
			default:
			System.out.println("Enter the valid Number");
			break;
			case 1:
			System.out.println("January");
			break;
			case 2:
			System.out.println("February");
			break;
			case 3:
			System.out.println("March");
			break;
			case 4:
			System.out.println("April");
			break;
			case 5:
			System.out.println("May");
			break;
			case 6:
			System.out.println("June");
			break;
			case 7:
			System.out.println("July");
			break;
			case 8:
			System.out.println("Augest");
			break;
			case 9:
			System.out.println("September");
			break;
			case 10:
			System.out.println("October");
			break;
			case 11:
			System.out.println("November");
			break;
			case 12:
			System.out.println("December");
			break;
		}
	}
}
		
		