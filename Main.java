public class Main {
    public static void main(String[] args) {
	NewCalculator calculator = new NewCalculator();

	// try division
calculator.Divide(100,12);
System.out.println(calculator.getLastResult());

//try addition 
calculator.Add(10,35);
System.out.println(calculator.getLastResult());

// try subtraction
calculator.Subtract(50,15);
System.out.println(calcuator.getLastResult());

// try multiplication
calculator.Multiply(10,30) ;
System.out.println(calculator.getLastResult());

    }
}
