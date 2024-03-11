import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="namburan";
		Map<Character,Integer> hm=new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), count+1);
				//System.out.println(str.charAt(i));
			}else {
				hm.put(str.charAt(i), count);
			}
		}
		for(Map.Entry<Character,Integer> entrySet: hm.entrySet()) {
			if(entrySet.getValue()>0) {
				System.out.println("firstRepeating char :"+ entrySet.getKey());
				break;
			}
		}
		for(Map.Entry<Character,Integer> entrySet: hm.entrySet()) {
			if(entrySet.getValue()==0) {
				System.out.println("firstNoneRepeating char :"+ entrySet.getKey());
				break;
			}
		}

		
//		Map<Integer,Integer> hm=new LinkedHashMap<>();
//		//Map<Integer,String>hm2=new HashMap<>();
//		//Map<String,Integer> h3=new HashMap<>();
//		hm.put(1, 2);
//		hm.put(2, 4);
//		hm.put(3, 6);
//		hm.put(4, 2);
//		hm.put(1, 8);
//		hm2.put(5, "a");
//		h3.put("a",9);
//		hm1.put(2, 4);
//		hm.putAll(hm1);
//		System.out.println(hm);
	}

}
