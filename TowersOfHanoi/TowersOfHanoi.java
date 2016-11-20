import edu.princeton.cs.introcs.Stopwatch;

public class TowersOfHanoi {
	public static void move(int numberOfDisks, int startPole, int tempPole, int endPole){
		if (numberOfDisks > 0){
			move(numberOfDisks -1, startPole, endPole, tempPole);
			System.out.println("Move disk " +numberOfDisks + " from pole " + startPole + " to pole " + endPole);
			move(numberOfDisks - 1, tempPole, startPole, endPole);
		}
	}
	
	public static void main(String[] args){
		Stopwatch stopwatch = new Stopwatch();
		
		move(4, 1, 2, 3);
		
		double time = stopwatch.elapsedTime();
		System.out.println("elapsed time " + time);
	}

}
