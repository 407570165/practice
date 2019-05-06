package tom.com;

import java.util.Scanner;

public class Cut {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("pizza 要切幾片");
		int[] current = {8,12,16};
			
		try {
			Pizza piece = new Pizza(scanner.nextLine());
			if(piece.value==0) {
				System.out.println("確定不要切嗎");
			}else if(piece.value<=1||piece.value>=16) {
				System.out.println("超出範圍");
			}else if(piece.value==current[0]||piece.value==current[1]
				||piece.value==current[2]) {
				System.out.println("謝謝選購");
				}
		}catch (CutFormatException e) {
		}
			
	}

}
