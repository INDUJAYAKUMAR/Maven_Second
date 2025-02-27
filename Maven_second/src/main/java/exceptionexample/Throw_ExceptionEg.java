package exceptionexample;

public class Throw_ExceptionEg
{

	public static void main(String[] args) 
	{
		int age = -16;
		if (age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Not eligible for voting");
		}
	
		
	}

}
