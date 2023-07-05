// Java program to sort an array in
// decreasing order of their frequency
import java.util.*;

class Solution{

static int sortByFreq(Integer []arr, int n)
{

	                    /
	int maxE = -1;

	
	for (int i = 0; i < n; i++) {
		maxE = Math.max(maxE, arr[i]);
	}

	
	int freq[] = new int[maxE + 1];

	for (int i = 0; i < n; i++) {
		freq[arr[i]]++;
	}
    int cnt = 0;

		for (int i = 0; i <= maxE; i++) {

		if (freq[i] > 0) {

			int value = 100000 - i;
			arr[cnt] = 100000 * freq[i] + value;
			cnt++;
		}
	}

	
	return cnt;
}

static void printSortedArray(Integer []arr, int cnt)
{


	for (int i = 0; i < cnt; i++) {


		int frequency = arr[i] / 100000;
		int value = 100000 - (arr[i] % 100000);

		for (int j = 0; j < frequency; j++) {
			System.out.print(value + " ");
		}
	}
}


public static void main(String[] args)
{

	Integer arr[] = { 4, 4, 5, 6, 4, 2, 2, 8, 5 };

	int n = arr.length;

	int cnt = sortByFreq(arr, n);
	Arrays.sort(arr, Collections.reverseOrder());
	printSortedArray(arr, cnt);

}
}


