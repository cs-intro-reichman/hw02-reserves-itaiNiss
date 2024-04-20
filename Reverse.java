/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args)
	{
		//// Put your code here
		String str = args[0];
		int n = str.length() - 1;
		for(int i = n; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("The middle character is " + str.charAt(n / 2));
	}
}
