import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ThreeSumMystery {
	
	public static int mystery(int target, int[] a){
		int N = a.length;
		int cnt = 0;
		
		Arrays.sort(a);
		for (int i=0; i<N-1; i++)
			for (int j=i+1; j<N; j++){
				int key = target-a[i]-a[j];
		if(Arrays.binarySearch(a, j+1, N, key) >0)
			cnt++;
			}
		return cnt;
	}
	
	public static void main(String[] args){
		System.out.println(bruteMystery());
	}
	
	public static int bruteMystery(){
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int N = a.length;
		int target = 6;
		int cnt = 0;
		
		for (int i=0; i<N; i++)
			for( int j=0; j<N; j++)
				for (int k=0; k<N; k++)
					if (i<j&&j<k)
						if(a[i] + a[j] + a[k] == target)
							cnt++;
		return cnt;
	}
	
	@Test
	public void testMystery(){
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int target = 6;
		
		assertEquals(mystery(target, a),1);
	}
}
