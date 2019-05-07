package tom.com;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array =Arrays.asList(5,3,4,7);
		System.out.println(array);
		
		
		/*List<Integer> bag =new ArrayList<>();
		bag.add(3);
		bag.add(8);
		System.out.println(bag);
		
		HashSet p =new HashSet();
		p.add(8);
		p.add(9);
		p.add(8);
		p.add(7);
		System.out.println(p);//蝯�789 ��隞交����������*/
		Random rand= new Random(47);
		Map<Integer, Integer> m =new HashMap<Integer,Integer>();
		for(int i =0;i<10000;i++) {
			int r=rand.nextInt(20);
			Integer freq=m.get(r);
			if(freq==null) {
				m.put(r, 1);
			}
			else {
				m.put(r, freq+1);
			}
		}
		System.out.println(m);
		/*List<Integer> rank =new ArrayList<>();
		for(int i =0;i<20;i++) {
			rank.add(0);
		}
		Random random =new Random();
		for(int i =0;i<10000;i++) {
			int r= random.nextInt(20);
			Integer freq =rank.get(r);
			rank.set(r, freq+1);
			if(freq==0) {
				freq=freq+1;
			}else {
				freq=freq++;
			}
		}
		System.out.println(rank);
		List <Integer> list =new ArrayList<>();
		int[] freqs =new int[20];
		Random randoms =new Random();
		for(int i =0;i<10000;i++) {
			int r=randoms.nextInt(20);
			list.add(r);
			freqs[r]++;
		}
		for(int i=0;i<freqs.length;i++) {
			System.out.println(list.get(i));
		}*/
	}

}
