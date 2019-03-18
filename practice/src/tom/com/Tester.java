package tom.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*List<Integer> rank =new ArrayList<>();
			for(int i =0;i<20;i++) {
				rank.add(0);
			}*/
			/*Random random =new Random();
			for(int i =0;i<10000;i++) {
				int r= random.nextInt(20);
				Integer freq =rank.get(r);
				rank.set(r, freq+1);
				/*if(freq==0) {
					freq=freq+1;
				}else {
					freq=freq++;
				}*/
			//}
			//System.out.println(rank);
			List <Integer> list =new ArrayList<>();
			int[] freqs =new int[20];
			Random random =new Random();
			for(int i =0;i<10000;i++) {
				int r=random.nextInt(20);
				list.add(r);
				freqs[r]++;
			}
			for(int i=0;i<freqs.length;i++) {
				System.out.println(list.get(i));
			}
	}

}
