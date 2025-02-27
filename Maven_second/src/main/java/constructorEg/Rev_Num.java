package constructorEg;

public class Rev_Num {
    private int a;
    private int reverse;
    int reverse1;

    // Constructor to calculate reverse
    public Rev_Num(int a) {
        this.a = a;
        this.reverse = 0;

        // Calculate the reverse of the number
        while (a != 0) {
            reverse1 = reverse * 10 + a % 10;
            a /= 10;
        }
    }

    // Constructor to display the reverse
    public Rev_Num() {
        System.out.println("The reverse of the number is: " + reverse1);
    }

    public static void main(String[] args) {
    	   Rev_Num obj2 = new Rev_Num();
        // Invoke only the constructor that calculates reverse
        Rev_Num obj1 = new Rev_Num(12345);

        // Invoke the constructor to display the result (reverse calculation happens in the first constructor)
     
    }
}
