/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		System.out.println(1);
		for(int i = 2 ; i < n; i++)
		{
			if (n % i == 0)
			{
				System.out.println(i);
			}
		}
		System.out.println(n);


	}
}
