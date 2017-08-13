package CodingBat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static  Map<String, Integer> word0(String[] strings) {
		  Map<String, Integer> map = new HashMap<>();
		  for (int i=0; i<strings.length; i++){
		    map.put(strings[i],0);
		  }
		  return map;
		}

	
	public static  Map<String, Integer> wordLen(String[] strings) {
		  Map<String, Integer> map = new HashMap<>();
		  for (int i=0; i<strings.length; i++){
		    map.put(strings[i],strings[i].length());
		  }
		  return map;
		}

	
	public static  Map<String, String> pairs(String[] strings) {
		  Map<String, String> map = new HashMap<>();
		  for (int i=0; i<strings.length; i++){
		    map.put(strings[i].substring(0,1),strings[i].substring(strings[i].length()-1));
		  }
		  return map;
		}

	
	public static  Map<String, Integer> wordCount(String[] strings) {
		  Map<String, Integer> map = new HashMap<>();
		  for (int i=0; i<strings.length; i++){
		    if (map.containsKey(strings[i])){
		      map.put(strings[i], map.get(strings[i])+1);
		    }
		    else {
		      map.put(strings[i], 1);
		    }
		  }
		  return map;
		}

	
	public static  Map<String, String> firstChar(String[] strings) {
		  Map<String, String> map = new HashMap<>();
		  
		  for (int i=0; i<strings.length; i++){
		    String firstChar = strings[i].substring(0,1);
		    if (map.containsKey(firstChar)){
		      map.put(firstChar, map.get(firstChar)+strings[i]);
		    }
		    else {
		      map.put(firstChar, strings[i]);
		    }
		  }
		  return map;
		}

	
	public static  String wordAppend(String[] strings) {
		  String result = "";
		  Map<String, Integer> map = new HashMap<>();
		  for (int i=0; i<strings.length; i++){
		    if (map.containsKey(strings[i])){
		      map.put(strings[i], map.get(strings[i])+1);
		      if (map.get(strings[i]) % 2 == 0) {
		        result+=strings[i];
		      } 
		    }
		    else {
		      map.put(strings[i], 1);
		    }
		  }
		  return result;
		}

	
	public static  Map<String, Boolean> wordMultiple(String[] strings) {
		  String result = "";
		  Map<String, Boolean> map = new HashMap<>();
		  for (int i=0; i<strings.length; i++){
		    if (!map.containsKey(strings[i])){
		      map.put(strings[i], false);
		    }
		    else {
		      map.put(strings[i], true);
		    }
		  }
		  return map;
		}

	
	public static  String[] allSwap(String[] strings) {

		  Map<String, Integer> map = new HashMap<>();
		  for (int i=0; i<strings.length; i++){
		    String firstChar = strings[i].substring(0,1);
		    if (!strings[i].equals("")){
		      if (map.containsKey(firstChar)){
		        String tmp = strings[map.get(firstChar)];
		        strings[map.get(firstChar)] = strings[i];
		        strings[i]= tmp;
		        map.remove(firstChar);
		      }
		      else {
		        map.put(firstChar, i);
		        
		      }
		    }
		  }
		  return strings;
		}

	
	public static  String[] firstSwap(String[] strings) {
		  
		  Map<String, Integer> map = new HashMap<>();
		  for (int i=0; i<strings.length; i++){
		    String firstChar = strings[i].substring(0,1);
		    if (!strings[i].equals("")){
		      if (map.containsKey(firstChar)){
		        if (map.get(firstChar)!=-1) {
		          String tmp = strings[map.get(firstChar)];
		          strings[map.get(firstChar)] = strings[i];
		          strings[i]= tmp;
		          map.put(firstChar, -1);
		        }
		      }
		      else {
		        map.put(firstChar, i);
		        
		      }
		    }
		  }
		  return strings;
		}

	
	
}
