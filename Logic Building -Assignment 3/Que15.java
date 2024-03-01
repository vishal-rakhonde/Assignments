/*15. Write a Java program to calculate the sum of digits of a number. The program should ask the
user to enter a number and then use a do-while loop to calculate and display the sum of digits of
that number.*/
import java.util.Scanner;
class Que15{
	public static void main(String[] args){
		int rem,sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number ");
		int a=sc.nextInt();
		do{
			
			rem=a%10;
			sum+=rem;
			a=a/10;
			
		}while(a>0);
		System.out.println(" "+sum);
	}
}
		