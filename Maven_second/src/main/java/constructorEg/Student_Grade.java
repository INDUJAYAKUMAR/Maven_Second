//Write a program to find the grade of 2 students based on total marks(3 subjects)
//a. Get the student‟s marks by constructor
//b. Return total mark to in main method
//c. Find the grade of each student.

package constructorEg;

public class Student_Grade {
	static float perstdmark1;
	static float perstdmark2;
	public Student_Grade(int mal1, int eng1, int hin1) {
		
		float Sumstdmark1 = 	eng1+mal1+hin1;
		 perstdmark1 = Sumstdmark1/0.03f;
		System.out.println("Total mark of student1 is: "+Sumstdmark1);
	}
	public Student_Grade(int mal2, float eng2, int hin2) {
		
		float Sumstdmark2 = 	eng2+mal2+hin2;
		 perstdmark2 = Sumstdmark2/0.03f;
		System.out.println("Total mark of student2 is: "+Sumstdmark2);
	}

	public static void main(String[] args) {
		Student_Grade name1 = new Student_Grade(80,90,60);
		Student_Grade name2 = new Student_Grade(50,62,70);
		if(perstdmark1>=90)
		{
			System.out.println("Grade A");
		}
		else if(perstdmark1>80)
		{
			System.out.println("Grade B");
		}
		else if(perstdmark1>70)
		{
			System.out.println("Grade C)");
			
		}
		else
		{
			System.out.println("Failed");
		}
		if(perstdmark2>=90)
		{
			System.out.println("Grade A");
		}
		else if(perstdmark2>80)
		{
			System.out.println("Grade B");
		}
		else if(perstdmark2>70)
		{
			System.out.println("Grade C)");
			
		}
		else
		{
			System.out.println("Failed");
		}
		

	}

}
