package HackerRank.Day14;

public class Difference {
	
	private int[] elements;
  	public int maximumDifference;

  	public Difference(int[] a) {
  		elements = a;
	}
  	
  	
	public void computeDifference() {
		for(int i = 0; i < elements.length-1; i++){
			for(int j = i+1; j < elements.length; j++){
	            if (Math.abs(elements[i]-elements[j])>maximumDifference){
	            	maximumDifference=Math.abs(elements[i]-elements[j]);
	            }
	        }
        }
	}

}
