import java.util.Scanner;
 
public class Automorphic_no {
 
    public static void main(String args[]){
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
 
        int c=0, sqr = num*num;
        int temp =num;  
 
    
        while(temp>0){
            c++;
            temp=temp/10;
        }
        //lSD= Last Square Digit
        int lSD = (int) (sqr%(Math.pow(10,c)));
 
        if(num == lSD)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
    }
}

/**
 * @author Pradumn Patel */