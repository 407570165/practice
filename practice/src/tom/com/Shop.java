package tom.com;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Item2> items =new ArrayList<>();
	Scanner scanner= new Scanner(System.in);
	while(true) {
		System.out.println("name");
		String name =scanner.nextLine();
		System.out.println("number");
		int number =scanner.nextInt();
		scanner.nextLine();
		items.add(new Item2(name, number));
		
		for(Item2 item : items) {
			System.out.println(item.name+"\t"+item.number);
		}
	}
	
	}

}
