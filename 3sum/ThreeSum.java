
public class ThreeSum{
	public static int count(int[] a){
		int N = a.length;
		int count = 0;
			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++)
					for (int k = 0; k < N; k++)
						if(i<j && j<k)
						if (a[i] + a[j] + a[k] == 0)
							System.out.println("i: "+a[i]+" j: " +a[j]+ " k: "+ a[k]);

							count++;
	return count;
	}
	
	public static void main(String[] args){
	 int[] a = {0,1,2,3,4,5,-3,5,6,0,2,1};
	 System.out.println(count(a));
	}
	}

