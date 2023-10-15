import java.util.*;
class CircularPrime
{
    static boolean isprime(int num)
    {
        boolean flag=true;
        for(int a=2;a<=num/2;a++)
        {
            if(num%a==0)
            {
                flag=false;
                break;
            }
        }
        return(flag);
    }
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int num,count=0,temp,base;
        System.out.println("Enter any Number");
        num=sc.nextInt();
        temp=num;
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        base=(int)Math.pow(10,count-1);
        boolean flag=true;
        for(int a=1;a<=count;a++)
        {
            num=(num%base)*10+(num/base);
            if(CircularPrime.isprime(num)==false)
            {
                flag=false;
                break;
            }
            System.out.println(num);
        }
        if(flag==true)
        {
            System.out.println("Number is Circular Prime");
        }
        else
        {
            System.out.println("Number is Not Circular Prime");
        }
    }
}

/**
 * @author Pradumn Patel */