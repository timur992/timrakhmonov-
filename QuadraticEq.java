

import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		// using while loops and if statement create the quadratic equation solver
		
		// a*x^2+b*x+c=0
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Quadratic Equation Solver ! ");

		// take users input for coefficient a
		System.out.println("Please enter the a: ");
		float a= input.nextFloat();
		System.out.println("a = " + a + " !");

		// take users input for coefficient b
		System.out.println("Please enter the b: ");
		float b = input.nextFloat();
		System.out.println("b = " + b + " !");

		// take users input for coefficient a
		System.out.println("Please enter the c: ");
		float c = input.nextFloat();
		System.out.println("c = " + c + " !");
		
		//Quadratic equation
		System.out.println("Qaudratic equation to solve is : " + a +"*x^2 + " + b +"*x + " + c + " = 0 ;" );
		
		double d = b*b-4*a*c;
		System.out.println("Dicriminant of the equation is = " + d);
		
		if (d < 0) {
			System.out.println("The quadratic equation does not have a real roots!!!!");
		}
		
		if(d == 0) {
			System.out.println("Equation has only one root!");
			double x = (-b)/(2*a);
			System.out.println("The root is = " + x + " !!!");
		}
		
		if(d > 0) {
			System.out.println("Eqaution have two roots!");
			double x1 = ((-b)+Math.sqrt(d))/(2*a);
			double x2 = ((-b)-Math.sqrt(d))/(2*a);
			System.out.println("The root are : " +"x1 = " + x1 + " x2 = " +x2 + " !!!");
        }
    }
}
			