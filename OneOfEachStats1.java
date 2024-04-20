/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt(args[0]);
		int FamiliesOf2Childs = 0;
		int FamiliesOf3Childs = 0;
		int FamiliesOf4OrMoreChilds = 0;
		double sumFamiliesOfChilds = 0;

		for(int i = 0; i < T; i++)
		{
			boolean girl = false;
			boolean boy = false;
			int count = 0;

			while (!(girl && boy))
			{
				double rnd = Math.random();
				if (rnd < 0.5)
				{
					girl = true;
				}
				else
				{
					boy = true;
				}
				count++;
			}
			sumFamiliesOfChilds = sumFamiliesOfChilds + count;
			if (count == 2) 
			{
				FamiliesOf2Childs++;
			}
			else
			{
				if (count == 3) 
				{
					FamiliesOf3Childs++;
				}
				else
				{
					FamiliesOf4OrMoreChilds++;
				}
			}
			
		}
		double avg = sumFamiliesOfChilds / T;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + FamiliesOf2Childs);
		System.out.println("Number of families with 3 children: " + FamiliesOf3Childs);
		System.out.println("Number of families with 4 or more children: " + FamiliesOf4OrMoreChilds);

		int max = Math.max(Math.max(FamiliesOf2Childs, FamiliesOf3Childs), FamiliesOf4OrMoreChilds);
		String commom = "The most common number of children is ";
		if (max == FamiliesOf2Childs) 
		{
			commom = commom + "2.";
		}
		else
		{
			if (max == FamiliesOf3Childs) 
			{
				commom = commom + "3.";
			}
			else
				{
					commom = commom + "4 or more.";
				}	
		}
			
		System.out.println(commom);
	}
}
