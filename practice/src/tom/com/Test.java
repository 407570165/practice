package tom.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=20000;
		int number =0;
		Scanner scanner =new Scanner(System.in);
		System.out.print("how many people:");
		try{
		String n =scanner.nextLine();
		number =Integer.parseInt(n);
		System.out.println("get: " + (money/number));
		}
		catch(Exception e) {
			System.out.println("錯誤");
		}
		/*catch(ArithmeticException E) {
			System.out.println("數值錯誤");
		}
		catch(NumberFormatException e) {
			System.out.println("格式錯誤");
		}*/
	}

}
