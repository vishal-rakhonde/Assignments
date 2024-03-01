/*14. Write a Java program to find the factorial ofa number. The program should ask the user to
enter a number and then use a while loop to calculate and display the factorial of that number.*/
import java.util.Scanner;
class Que14{
	
	public static void main(String[] args){
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		for(int i=a;i>=1;i--){
			fact*=i;
		}
		System.out.println("Factorial of "+a+" is "+fact+" .");
	}
}