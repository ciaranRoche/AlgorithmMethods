/*
 * Given an array of positive integers (excluding zero) and a target integer, write an algorithm that outputs whether there is a set of consecutive elements in the array that add up to the target. For example, an input array a = {1, 5, 3, 7, 9}, target = 8 returns true ({5, 3}), target = 15  returns true ({5, 3, 7}), but target=4 would return false. 
State the efficiency class of your solution. If the input array is always sorted, suggest an improvement, if any, to your algorithm.
 */

public class ConsecutiveInts {

	public static void main(String[] args){
		int[] a={1,5,3,7,9};
		int target=8;
		System.out.println(consecutiveLowerUpper(a,target));
	}
	
	private static boolean consecutiveSorted(int[] a, int target){
		for(int i=0; i<a.length-2;i++){
			if(a[i]>target/2) break;
			
			int total = a[i];
			int offset = 1;
			do{
				total+=a[i+offset];
				if(total==target) return true;
				if(a[i+offset]>target/2) break;
				
				offset++;
				
			}while (total<=target && i+offset<a.length);
		}
		return false;
	}
	
	public static boolean consecutive(int[] a, int target){
		for(int i=0;i<a.length;i++){
			int total = a[i];
			int offset = 1;
			do{
				total+=a[i+offset];
				if(total==target) return true;
				offset++;
			}while (total<=target && i+offset<a.length);
		}return false;
	}
	
	public static boolean consecutiveLowerUpper(int[] a, int target){
		int lower = 0, upper = 0;
		int total = a[lower];
		do{
			System.out.println(lower + " " + total);
			upper++;
			if(lower+upper==a.length) break;
			total+=a[upper];
			if(total==target) return true;
			else if (total>target){
				total-=a[upper--];
				total-=a[lower++];
				
			}
		}while (lower<a.length);
		return false;
	}
}
