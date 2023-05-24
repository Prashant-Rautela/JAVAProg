package CollectionFramework;
import java.util.*;

public class ListConcept {
	
	public static void main(String args[]) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Virat");
		list1.add("MS");
		list1.add("Sachin");
		
		for(String s:list1) {
			System.out.println(s);
		}
		
		Iterator itr = list1.iterator();
		for(int i = 0; i<list1.size();i++) {
		if (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}}
	
	
	
	

}
