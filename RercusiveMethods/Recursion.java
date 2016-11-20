
public class Recursion {

	public static void main(String [] args){
		//countDown(3);
		System.out.println(sumOf(2));
	}

	private static int sumOf(int n) {
		// TODO Auto-generated method stub
		int sum;
		if (n == 1){
			sum = 1;
		}else{
			sum = sumOf(n-1) + n;
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
