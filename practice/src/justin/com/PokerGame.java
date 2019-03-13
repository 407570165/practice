package justin.com;
public class PokerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poker poker =new Poker();
		poker.print();
		Card[] card =new Card[10];
		card[5]=new Card(6);
		System.out.println(card[5].get());
	}

}
