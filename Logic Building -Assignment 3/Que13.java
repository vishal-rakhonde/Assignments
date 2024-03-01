/*13. Write a Java program to display the multiplication table ofa given number. The program
should ask the user to enter a number and then use a for loop to display the multiplication table
of that number from I to 10. */
import java.util.Scanner;
class Que13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++){
		System.out.println(a+" * "+i+" = "+a*i);
		}
	}
}