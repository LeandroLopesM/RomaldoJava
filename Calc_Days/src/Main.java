//import java.util.random.RandomGenerator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.lang.Integer;

public class Main {
	

	public static void main(String[] args) {
		
		System.out.print("Demonstre vossa idade, paspalhão. (Por meio do formato YYYY MM DD): ");
		Scanner scn = new Scanner(System.in);
		
		List<String> data = Tokenize(scn.nextLine());
		
		if(data.get(0).length() != 4 &&
				data.get(0).length() != 2 &&
					data.get(0).length() != 2) {
			System.err.println("Wrong fucking syntax shitstick");
			System.exit(1);
		}
		
		int days = 0;
		
		try {
			days = Integer.parseInt(data.get(2));
			days += Integer.parseInt(data.get(1)) * 30;
			days += Integer.parseInt(data.get(0)) * 365;
		} catch(NumberFormatException nfe) {
			System.err.println("It outta be numerical junior!");
			System.exit(1);
		}
		
		System.out.println("You been live fo: " + days + " Days");
		
		
		
		
		scn.close();
	}
	
	public static List<String> Tokenize(String FullStr) {
		StringTokenizer strt = new StringTokenizer(FullStr);
		List<String> tokens = new ArrayList<>();
		
		while(strt.hasMoreTokens()) {
			tokens.add(strt.nextToken());
		}
		
		return tokens;
	}
}
