/*4. Write a Java program to find the sum of all elements in an integer array.
Expected Input: An array of integers (e.g., {1, 2, 3, 4, 5})
Expected Output: Sum of all elements (e.g., 15)*/
import java.util.Scanner;
class Que4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,sum=0;
		int[] arr=new int[5];
		for(i=0;i<arr.length;i++){
			System.out.print("Enter array index "+i+" ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of all array element is "+sum);
	}
}
			
			
		