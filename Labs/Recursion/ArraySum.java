package cmsc204_inclass;

public class ArraySum {

	
	public int sumOfArray (Integer[] a,int index) {
				
		if (index == 0)
			return a[0];
		else 
			return a[index] + sumOfArray(a, index-1); 
	}
}
