
public class Fibonacci {
	public static int fib(int n){
		int calc;
		if ((n == 0) || ( n == 1)){
			return n;
		}else{
			
			calc = fib(n-1) + fib(n-2);
			//return calc;
		}
		return calc;
	}
	
	public static void main(String[] args){
		int n = 10;
		for(int count = 0; count <= n; count++){
		System.out.printf("Fibonacci of %d is: %d\n", count ,fib(count));
		}
	}
}
