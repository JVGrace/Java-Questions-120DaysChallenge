//Code for Trendy Number
import java.util.*;
public class Main {
   
   public static void main(String[] args) {
    System.out.println("Enter the number: ")
      Scanner scan = new Scanner(System.in);
      int inputNumber = scan.nextInt;

      
      int i;
      int factorial,digit;
      int sum = 0;
      int temp = inputNumber;
      while(temp!=0){
        i=1;
        factorial=1
        digit=temp%10;
        while(i<=digit){
        factorial= factorial*1;
        i++;
        }
        sum = sum + factorial;
        temp= temp/10;


      }
      
      if(sum == inputNumber)
         
         System.out.println(inputNumber + " is a strong number\n");
      else
         
         System.out.println(inputNumber + " is not a strong number\n");
   }   
}