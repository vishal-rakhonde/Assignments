/*11. Assume getnumber(); returns a number entered by a user. Write some code using a while
loop that echos whatever number the user enters unless they enter 0 in which case the
program exits. Could you do this with a for loop?
*/
import java.util.Scanner;
class Que11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(num>0){
			if(num==0){
				break;
			}
			System.out.println(num);
			num--;
		}
	}
}