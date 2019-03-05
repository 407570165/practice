package tom.com;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> bag =new ArrayList<>();
		bag.add(3);
		bag.add(8);
		System.out.println(bag);
		
		HashSet p =new HashSet();
		p.add(8);
		p.add(9);
		p.add(8);
		p.add(7);
		System.out.println(p);//結果為789 所以沒有順序和可重複性
	}

}
