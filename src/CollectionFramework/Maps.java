package CollectionFramework;
import java.util.*;


public class Maps {

	public static void main(String args[]) {
		
		/*
		 * HashMap<Integer, String> hmap = new HashMap<Integer, String>(); hmap.put(1,
		 * "MSD"); hmap.put(2, "UV"); hmap.put(3, "Virat"); hmap.put(4, "Sachin");
		 * 
		 * for (Map.Entry m : hmap.entrySet()) { System.out.println(m.getKey() + " " +
		 * m.getValue()); }
		 */
		
String s = "Prashant Rautela";
        
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        
        String[] c = s.split("");
        for (int i = 0; i<c.length;i++){
            
            if(!hmap.containsKey(c[i])){
                hmap.put(c[i],1);
            }
            
            else{
                hmap.put(c[i],hmap.get(c[i]) + 1);
            }
            
        }
        
        for (Map.Entry m : hmap.entrySet()) {
        	System.out.println(m.getKey() + ": " + m.getValue());
        }
	}
	
	
	
}
