/*6. Write a Java program to reverse an array of integers without using additional arrays or
collections.
Expected Input: An array of integers (e.g., {l, 2, 3, 4, 5})
Expected Output: Reversed array (e.g., {5, 4, 3, 2, 1})*/
import java.util.Scanner;
class Que6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,sum=0;
		int[] arr=new int[5];
		for(i=0;i<arr.length;i++){
			System.out.print("Enter array index "+i+" ");
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++){
		System.out.print("  "+arr[i]);
		}
		System.out.println();
		for(i=arr.length-1;i>=0;i--){
		System.out.print("  "+arr[i]);
		}
			
	}
}