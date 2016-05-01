import java.util.Scanner;

public class TestFloatingPointPrecision {
	
	public static void main(String[] args){
		
		//New scanner
		Scanner input = new Scanner(System.in);
		
		//Enter first number
		System.out.println("Enter first number:");
		double number1 = input.nextDouble();
		
		//Enter second number
		System.out.println("Enter second number:");
		double number2 = input.nextDouble();
		
		//New FloatingPointPrecision FP
		FloatingPointPrecision FP = new FloatingPointPrecision();
		
		//Enter scale
		System.out.println("Enter if it is infinite decimals,You want to get the number of bits after the dot:");
		int scale = input.nextInt();

		//Print result
		System.out.println("First number add second number = " + FloatingPointPrecision.add(number1,number2));
		System.out.println("First number sub second number = " + FloatingPointPrecision.sub(number1,number2));
		System.out.println("First number mul second number = " + FloatingPointPrecision.mul(number1,number2));
		System.out.println("First number div second number = " + FloatingPointPrecision.div(number1,number2, scale));
	}		
}
