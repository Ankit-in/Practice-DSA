import java.util.*;
public class FirstAL {

	public static void main(String[] args) {
		List<Integer> arrlist=new ArrayList<>();
		//List<Integer> arrlist2=new ArrayList<>();
		arrlist.add(5);
		arrlist.add(10);
		arrlist.add(15);
		arrlist.add(20);
		arrlist.add(25);
		arrlist.add(15);
		//arrlist2.add(20);
		//arrlist2.add(15);
		//System.out.println(arrlist);
		//arrlist.remove(2);
		//System.out.println(arrlist);
		//System.out.println(arrlist.size());
		//arrlist.add(2,15);
		//System.out.println(arrlist);
		//System.out.println(arrlist.addAll(arrlist));
		//arrlist.addAll(arrlist2);
		//System.out.println("---------");
		//for(int i:arrlist){
		//	System.out.print(i);
		//}
		//System.out.println("");
		for(int i=0;i<arrlist.size();i++) {
			System.out.print(arrlist.get(i)+", ");
		}
		//for(int i:arrlist) {
			//System.out.println(arrlist.get(i)); thows exception indexouoffbound becs. here i is actual arrlist element not index.
		//	System.out.println(arrlist);
			
		//}
		//arrlist.clear();
		//System.out.println(arrlist);
		//System.out.println(arrlist.contains(20));
		//System.out.println(arrlist.containsAll(arrlist2));
		//System.out.println(arrlist.indexOf(20)); it will check for first occurance of element
		//System.out.println(arrlist.isEmpty());
		//System.out.println(arrlist.lastIndexOf(5)); it will check for last occurance of element
		//System.out.println(arrlist.removeAll(arrlist2));
		//System.out.println(arrlist);
		//System.out.println(arrlist.toString());
		//System.out.println(arrlist.get(4));
		//Collections.sort(arrlist); sort in assending order.
		//System.out.println(arrlist);
		//Collections.sort(arrlist,Collections.reverseOrder());  sort in desending order.
		//System.out.println(arrlist);
	}

}
