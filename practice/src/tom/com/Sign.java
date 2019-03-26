package tom.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Sign {
	boolean number;
	String name;
	int am;
	ArrayList a= new ArrayList();
	public Sign(boolean number) {
		this.number=number;
	}
	public void get() {
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter shop name");
		String name =scanner.nextLine();
		System.out.println("please enter amount");
		int am =scanner.nextInt();
		scanner.nextLine();
		System.out.println("please enter 1 or 2");
		int determine =scanner.nextInt();
		if(determine==2) {
			a.add(name);
			a.add(am);
			System.out.println(name+" "+am);
		}
	}
	public void total() {
		a.add(name);
		a.add(am);
		System.out.println(name+" "+am);
	}
}
