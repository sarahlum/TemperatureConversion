import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {

	//Topic 1 Exercise 2
		double fInput, cInput, calculateC, calculateF; 

		Scanner scnr = new Scanner(System.in);
						
		//Get user to input Fahrenheit temperature
		System.out.print("Enter a Fahrenheit temperature: ");
		fInput = scnr.nextDouble();
						
		//Convert temperature to C
		calculateC = (fInput - 32.0) * 5.0/9.0;
		
				
		//Output Celsius temperature equivalency statement
		System.out.println(fInput + "F is equivalent to " + calculateC + "C");
		
		//Get user to input Celsius temperature
		System.out.print("Enter a Celsius temperature: ");
		cInput = scnr.nextDouble();
		
		//Convert temperature to F
		calculateF = 9.0/5.0 * cInput + 32.0;
		

		//Output Fahrenheit temperature equivalency statement
		System.out.print(cInput + "C is equivalent to " + calculateF + "F");	

		

	}

}
