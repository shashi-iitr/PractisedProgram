import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class DupliEle {

	public static void main(String [] args){
		int []A={2,3,1,4,2,5,89,76,1,2};
		countDup(A);
	}
	
	static void countDup(int []A){
		HashMap<Integer, Integer> aMap= new HashMap<Integer, Integer>();
		for(int a: A){
			int value=0;
			if(aMap.containsKey(a)){
				value=aMap.get(a);
			}
			value++;
			aMap.put(a, value);
		}
		
		Iterator<Entry<Integer, Integer>> it=  aMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry ele=it.next();
			int key=(int) ele.getKey();
			int val=(int) ele.getValue();
			System.out.println("k= "+key+" v= "+val);
		}
	}
}
