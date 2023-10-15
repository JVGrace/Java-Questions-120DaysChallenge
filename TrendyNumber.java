import java.util.Scanner;
class trendyNo{

        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m=0,p=0;
        n=sc.nextInt();

        if(n>=100 && n<=999){
            m=n/10;
            p=m%10;
            }
        if(p%3==0){
            System.out.println("Trendy Number");
            }
        else{
            System.out.println("Not a Trendy Number");
            }
        }
} 
/**
 * @author Pradumn Patel */