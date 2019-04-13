package tom.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array =new ArrayList<>();
		ArrayList<Integer> arrays =new ArrayList<Integer>();
		while(true) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter shop name");
		String name =scanner.nextLine();
		System.out.println("please enter amount");
		int am =scanner.nextInt();
		scanner.nextLine();
		array.add(name);
		arrays.add(am);
		
		System.out.println(name+" "+am);
		 
		}
	}
}