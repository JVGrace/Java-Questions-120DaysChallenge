
import java.util.*;

public class Solution
{

static void printOrder(int[] arr, int number)
{
	
	Arrays.sort(arr);

	
	for (int i = 0; i < number/ 2; i++)
		System.out.print(arr[i]+" ");

	
	for (int j = number - 1; j >= number / 2; j--)
	System.out.print(arr[j]+" ");
	
}

public static void main(String[] args)
{
	int[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
	int n = arr.length;
	printOrder(arr, n);

}
}

