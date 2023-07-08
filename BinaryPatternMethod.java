import java.util.*;
import java.util.Scanner;  
public class Pattern  
{              
    public static void main(String[] args)   
    {  
        int i;
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();         
        for (i = 1; i <= rows; i++)   
        {  
        if (i%2!=0){
            System.out.println(Integer.toBinaryString(i));
        }  
        }  
    }  
}  