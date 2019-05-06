package tom.com;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		try {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter english");
		Score english=new Score(scanner.nextLine());	
		System.out.println("enter math");
		Score math =new Score(scanner.nextLine());
		System.out.println((english.value+math.value)/2);
		}
		catch(ScoreFormatException e) {
		}
	}
}