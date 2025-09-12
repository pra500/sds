package pac1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pracc1 {
	
	public static void main(String[] args) {	
		
				
		String str = "pjkfktdfrp";

		char[] arr = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : arr) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> s = map.entrySet();
		for (Map.Entry<Character, Integer> m : s) {

			if (m.getValue() == 2 ) {
				System.out.println(m.getKey());
				break;
						
			}

		}

	}
	
	
	
		
	
	
	
<<<<<<< HEAD
=======
	
		
	
				
		
	
	
	
>>>>>>> master
	}


