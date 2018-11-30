import java.lang.Math;
import java.util.Scanner;

public class ComputeAreaWithConstant{
	public static void main(String [] args){
		final double PI = 3.14259;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");
		double radius = input.nextDouble();

		double area = PI * Math.pow(radius, 2);

		System.out.println("Area of the circle with radius " + radius + " is: " + area);
		 
	}
}
