package justin.com;

import java.util.ArrayList;

public class Poker {
	ArrayList bag =new ArrayList();
	public Poker() {
		for(int i=0;i<52;i++) {
			Card c =new Card(i);
			bag.add(c);
		}
	}
	public void print () {
		for(int i =0;i<52;i++) {
			Card c =(Card)bag.get(i);
			System.out.print(c.get());
			if(i%13==12) {
				System.out.println();
			}
		}
	}
}
