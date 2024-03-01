/*16. Write a Java program to check whether a number is prime or not. The program should ask
the user to enter a number and then use if-else statements to check and display whether the
number is prime or not.*/
import java.util.Scanner;
class  Que16{
	public static  void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		
		int i=sc.nextInt();
	
		if(i%2==0)
			System.out.println(i+" is Even Number");
		else
			System.out.println(i+" is Odd Number");
		
	}
}