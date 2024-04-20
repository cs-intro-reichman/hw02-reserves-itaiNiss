/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int rnd	 = (int) (10 * Math.random());
		int LastN = rnd;
		do
		{
			LastN = rnd;
			System.out.print(LastN + " ");
			rnd = (int) (10 * Math.random());
		}
		while(LastN <= rnd);
		
		System.out.println();
		}
	}
