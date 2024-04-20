/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int N = Integer.parseInt(args[0]);	
		String S = N + " is a perfect number since " + N + " = 1";
		int sum = 1;
		for(int i = 2; i < N; i++)
		{
			if (N % i == 0) 
			{
				sum = sum + i;
				S = S + " + " + i;
			}
		}	
		if (N != sum) 
		{
			S = N + " is not a perfect number";
		}
		System.out.println(S);
	}
}
