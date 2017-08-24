package Homework170823;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class WordFrequency {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("one","one","two","two","three");
		Map map = count_frequency(list);
		System.out.println(map);
		
		Map map2 = countFrequencyWithMerge(list);
		System.out.println(map);

	}

	private static Map countFrequencyWithMerge(List<String> list) {
		Map<String, Integer> map = new HashMap<>();
		list.forEach(s -> map.merge(s, 1, (a, b) -> a + b));
		
		return map;
	}

	public static Map count_frequency(List<String> list) {
		Map<String, Integer> map = new HashMap<>();
		for (String string : list) {
			if (map.containsKey(string)){
				 map.put(string, map.get(string)+1);
			}
			else map.put(string, 1);
		}

		
		return map;
	}
	
	
	
}
