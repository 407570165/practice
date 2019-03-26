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
		/*Random rand= new Random(47);
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
		System.out.println(m);*/
	}

}
