import java.util.*;
class swap{
    public static int Swap(int number_to_swap){
        System.out.println("The Number Given by user is :"+number_to_swap);
        int ans=0;
        int i=0;
        while (number_to_swap>0){
            if (number_to_swap>10000){
                System.out.println("Error: Number exceded default value set.");
            
            }
            else{
                int m = number_to_swap%10;
                ans = ans+(9-m)*(int)Math.pow(10,i++);
                number_to_swap=number_to_swap/10;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        System.out.println("Enter the number for swapping : ");
        Scanner scan = new  Scanner(System.in);
        int number_to_swap=scan.nextInt();
        System.out.println("The Swap is :"+Swap(number_to_swap));    
    }


}
