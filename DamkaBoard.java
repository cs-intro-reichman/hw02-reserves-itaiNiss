/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		for (int i = 0; i < n; i++)
		{
			for(int k = 0; k < n; k++)
			{
				if (i % 2 ==0) 
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.err.println();
		}
	}
}
