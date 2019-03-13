package justin.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map =new HashMap<Integer,Integer>();
		Random random =new Random();
		for(int i=0;i<10000;i++){
		int r =random.nextInt(20);
		Integer freqs =map.get(r);
		if(freqs==null) {
			map.put(r, 1);
		}else {
		map.put(r, freqs+1)	;
		}
	}
		System.out.println(map);

}
}
