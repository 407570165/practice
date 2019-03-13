package justin.com;

import java.util.ArrayList;
import java.util.Random;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<Integer>();
		Random random =new Random();
		//int[] time =new int[20];
		for(int i =0;i<20;i++) {
			list.add(0);
		}
		System.out.println(list);
		for(int i =0;i<10000;i++) {
			int r =random.nextInt(20);
			Integer freq =list.get(r);
			list.set(r, freq+1);
		}
		System.out.println(list);
	}

}
