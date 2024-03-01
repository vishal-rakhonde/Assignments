/*Write a program to implement a class "student" with the following members. Name of
the student. Marks of the student obtained in three subjects. Function to assign initial
values. Function to compute total average. Function to display the student's name and the
total marks. Write an appropriate main() function to demonstrate the functioning of the
above.*/

class Student{
	String Name="Vishal Rakhonde";
	float Math=90.0f;
	float Physics=80.0f;
	float English=70.0f;
	
	public static void main(String[] args){
		Student s=new Student();
		System.out.println("Name of Student ="+s.nameOfStudent());
		System.out.println("Average Marks ="+s.average());
		System.out.println("Total Marks ="+s.totalMarks());
		
	}
	float average(){
		return (Math+Physics+English)/3;
}
	String nameOfStudent(){
		return Name;
	}
	float totalMarks(){
		return Math+Physics+English;
	}
}