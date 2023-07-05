// Java program to find maximum
// sum of hour glass in matrix
import java.io.*;

public class Solution {
	
static int Row = 4;
static int Column = 4;


static int findMaxSum(int [][]mat)
{
	if (Row < 3 || Column < 3){
		System.out.println("Not possible");
		System.exit(0);
	}
	int max_sum = Integer.MIN_VALUE;
	for (int i = 0; i < Row - 2; i++)
	{
		for (int j = 0; j < Column - 2; j++)
		{
			
			int sum = (mat[i][j] + mat[i][j + 1] +
					mat[i][j + 2]) + (mat[i + 1][j + 1]) +
					(mat[i + 2][j] + mat[i + 2][j + 1] +
					mat[i + 2][j + 2]);

			
			max_sum = Math.max(max_sum, sum);
		}
	}
	return max_sum;
}

	// Driver code
	static public void main (String[] args)
	{
		int [][]mat = {{1, 2, 3, 4},
					{5,6,7,8},
					{9,10,1,2},
					{3,4,5,6}};
		int res = findMaxSum(mat);
		System.out.println("Maximum sum of hour glass = "+ res);
	}
	
}



