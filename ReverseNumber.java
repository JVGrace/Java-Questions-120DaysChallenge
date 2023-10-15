import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number:  ");  
      int num = scan.nextInt(), reversed = 0;
      
      System.out.println("Original Number: " + num);
  
      
      while(num != 0) {
      
        
        int digit = num % 10;
        reversed = reversed * 10 + digit;
  
        
        num /= 10;
      }
  
      System.out.println("Reversed Number: " + reversed);
    }
  }

  /**
 * @author Pradumn Patel */