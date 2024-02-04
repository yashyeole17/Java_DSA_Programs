package practice;

// formula : (-b +- squareroot of b(square) -4ac) / 2a

import java.io.*;
import static java.lang.Math.*;

public class Roots_Quadratic_Equation {

	public static void findRoots(double a, double b, double c) {
		if(a == 0) {
			System.out.println("Invalid");
			return;
		}
		double d = (b*b)-(4*a*c);
		double squr = sqrt(abs(d));
		
		if(d > 0){
			System.out.println("Roots are real and different");
			System.out.println((-b + squr) / (2 * a) + " and ");
			System.out.println((-b - squr) / (2 * a));
		}
		else if(d == 0) {
			System.out.println("One Roots is real");
			System.out.println(-b/2*a);
		}
		else{
			System.out.println("Roots are complex");
			System.out.println((-b / (2 * a)) + " + i" + squr / (2 * a) + " and ");
			System.out.println((-b / (2 * a)) + " - i" + squr / (2 * a));
		}
	}
	public static void main(String[] args) {
		double a = 1;
		double b = 6;
		double c = 4;
		findRoots(a,b,c);
	}
}
