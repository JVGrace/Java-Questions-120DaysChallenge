import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
    public static int[] findIndices(int[] arr, int t) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == t) {
                return new int[]{left, right};
            } else if (sum < t) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] inputArray = {1,2,4,2,1,3,7,11,15,};
        System.out.println("Enter Target value:");
        int targetValue = obj.nextInt();
        int[] result = findIndices(inputArray, targetValue);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No matching pair found.");
        }
    }
}
