//import java.util.random.RandomGenerator;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("P(Xa, Ya): ");
		
		int Xa = scn.nextInt();
		int Ya = scn.nextInt();
		
		System.out.print("P(Xb, Yb): ");
		
		int Xb = scn.nextInt();
		int Yb = scn.nextInt();
		
		double d = DistanceEval(Xa, Ya, Xb, Yb);
		
		System.out.printf("sqrt( (%d - %d)^2 + (%d - %d)^2 )", Xb, Xa, Yb, Ya);
		
		System.out.println("The distance is: " + d);
		
		scn.close();
	}
	
	public static double DistanceEval(int Xa, int Ya, int Xb, int Yb) {
		return Math.sqrt(Math.pow((Xb - Xa), 2) + Math.pow((Yb - Ya), 2)); 
	}
}
