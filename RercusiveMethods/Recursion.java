
public class Recursion {

	public static void main(String [] args){
		//countDown(3);
		//System.out.println(sumOf(3));
		//int[] array = {1,2,3,4,5,6,7,8,9};
		//displayArray(array, 1-1, 9-1);
	}

	private static void displayArray(int array[],int first,int last) {
		// TODO Auto-generated method stub
		if(first == last){
			System.out.println(array[first]+ " ");
		}else{
			int mid = first + last/2;
			displayArray(array, first, mid);
			displayArray(array, mid+1, last);
		}
	}

	private static int sumOf(int n) {
		// TODO Auto-generated method stub
		int sum;
		if (n == 1){
			sum = 1;
		}else{
			sum = sumOf(n-1) + n;
			return sum;
		}
		return sum;
	}

	private static void countDown(int integer) {
		// TODO Auto-generated method stub
		System.out.println(integer);
		if(integer>1){
			countDown(integer - 1);
		}
		
	}
}
