package tom.com;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	try {
	System.out.println("輸入數學成績");
	String m =scanner.nextLine();
	int math =Integer.parseInt(m);
	System.out.println("輸入英文成績");
	int english =Integer.parseInt(scanner.nextLine());
	int average=(math+english)/2;
	System.out.println("平均為:" + average);
	}
	catch(NumberFormatException e) {
		System.out.println("格式錯誤");
	}
	
	}

}
