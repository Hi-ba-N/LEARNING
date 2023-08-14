package temperatureConverter;

import java.util.Scanner;

public class TemperaturConverterApp {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the temperature in fahrenhiet:");
	double fahrenheit=scan.nextDouble();
	TemperatureConverter temperatureconvert=new TemperatureConverter();
	double Celsius=temperatureconvert.convertFahrenheitToCalculate( fahrenheit);
	System.out.println(Celsius);
}
}
