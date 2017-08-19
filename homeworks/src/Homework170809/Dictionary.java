package Homework170809;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Homework170809.Dictionary.Pair;

public class Dictionary <K,V> implements Iterable<Pair> {

	private static final int MAX = 5;
	private static final float LOAD_FACTOR = 0.75f;
	private int counter = 0;
	
	public static class Pair <K,V>{
		public Pair(K key2, V value2) {
			key = key2;
			value = value2;
		}
		
		K key;
		V value;
	}

	public int getCounter(){
		return counter;
	}
	

	List<Pair>[] data = new List[MAX];

	public void put(K key, V value) {
		
		putValue(key, value);
		
		if (counter > data.length && data.length / counter > LOAD_FACTOR){
			resize();
		}

	}
	
	
	private void resize() {
 
		List<Pair>[] oldData = data;
        int newLength = oldData.length * 3 / 2;
        this.data = new List[newLength];
        counter = 0;


        for (int i = 0; i < oldData.length; i++) {
            if (oldData[i] != null) {
                for (int j = 0; j < oldData[i].size(); j++) {
                    this.putValue((K) oldData[i].get(j).key, (V) oldData[i].get(j).value);
                    counter++;
                }
            }
        }
	}
	
	
	private void putValue(K key, V value) {
		int index = hash(key);
		if (data[index] == null) {
			data[index] = new ArrayList<>();
		}

		Pair pair = getPair(key, index);

		if (pair == null) {
			data[index].add(new Pair(key, value));
			counter++;
			return;
		}

		pair.value = value;
		counter++;
	}

	

	private int hash(K key) {
		return key.hashCode() & 0x7FFFFFFF % data.length;
	}

	public V get(K key) {
		Pair pair = getPair(key, hash(key));
		return pair == null ? null : (V) pair.value;
	}

	private Pair getPair(K key, int index) {

		List<Pair> list = data[index];
		if (list == null) { // guard condition
			return null;
		}
		for (Pair pair : list) {
			if (pair.key.equals(key)) {
				return pair;
			}
		}

		return null;
	}

	@Override
	public Iterator<Pair> iterator() {
		return new Iterator<Dictionary.Pair>() {
			int currentElement = -1;
			Iterator<Pair> listIterator = null;

			@Override
			public boolean hasNext() {

				if (listIterator != null && listIterator.hasNext()) {
					return true;
				}

				listIterator = null;

				for (++currentElement; listIterator == null
						&& currentElement < data.length; currentElement++) {
					List<Pair> list = data[currentElement];
					if (list == null) {
						continue;
					}
					listIterator = list.iterator();
					if (!listIterator.hasNext()) {
						continue;
					}
					return listIterator.hasNext();
				}

				return false;
			}

			@Override
			public Pair next() {
				if (!hasNext()) {
					throw new IllegalArgumentException();
				}
				return listIterator.next();
			}
		};
	}

}