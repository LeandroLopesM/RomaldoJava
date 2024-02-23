//import java.util.random.RandomGenerator;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Numero a processar: ");
		int num = scn.nextInt();
		
		if((num % 2) == 1) System.out.println("Impar");
		else System.out.println("Par");
		
		scn.close();
	}
}
