/*18. Write a Java program for a simple calculator that performs addition, subtraction,
multiplication, and division. The program should ask the user to enter two numbers and then ask
the user (or hardcode the value) to choose an operation (addition, subtraction, multiplication, or
division) using a menu. Use a switch-case statement to perform the selected operation and
display the result. If the user selects an invalid operation, display an error message.*/


import java.util.Scanner;
class Que18{
	public static void main(String[] args){
		System.out.println("Simple Calculator");
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter first number ");
		int num1=sc.nextInt();
		System.out.println("Enter second number ");
		int num2=sc.nextInt();

		System.out.println("Enter 1 for Addition\nEnter 2 for Substraction\nEnter 3 for Multiplication\nEnter 4 for Division");
		
		System.out.println("Enter your choice");
		int operation=sc.nextInt();
		int n;
		switch(operation){
			default :
			System.out.println("Enter the valid number");
			break;
			case 1:
			n=num1+num2;
			System.out.println("Addition of these two number is  "+n);
			break;
			case 2:
			n=num1-num2;
			System.out.println("Substraction of these two number is  "+n);
			break;
			case 3:
			n=num1*num2;
			System.out.println("Multiplication of these two number is  "+n);
			break;
			case 4:
			n=num1/num2;
			System.out.println("Division of these two number is  "+n);
			break;
			
		}
	}
}