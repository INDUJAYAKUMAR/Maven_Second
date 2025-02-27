package exceptionexample;

public class Throws_ExceptionEg {

	public static void main(String[] args) throws VotingException {
		int age = 16;
		if (age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new VotingException("Not eligible for voting");
		}
	
		
	}

}
