package tom.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array=new ArrayList();
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter 1 or 2");
		Sign add =new Sign(true);
		int determine =scanner.nextInt();
		
		if(determine==1) {
			add.get();
			
		}
		if(determine==2) {
			add.total();
		}
		
	}

}
