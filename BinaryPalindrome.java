import java.io.*;

class Main {
public static boolean isPalindrome(int N)
{
	
	
	String s = Integer.toBinaryString(N);
	

	int i = 0, j = s.length() - 1;
	while (i < j) {
	if (s.charAt(i) != s.charAt(j)) {
		return false;
	}
	i++;
	j--;
	}
	return true;
}

public static void main(String[] args) {
	int x = 16;
	System.out.println(isPalindrome(x));
	x = 17;
	System.out.println(isPalindrome(x));
}
}


