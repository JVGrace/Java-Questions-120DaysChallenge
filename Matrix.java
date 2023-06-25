import java.util.Scanner;
import java.util.Arrays;
class matrix{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int a=0,n2=s.nextInt();
int[][] n=new int[n1][n2];
for(int i=0;i<n1;i++){
for(int j=0;j<n2;j++){
n[i][j]=s.nextInt();
}
}
int n3=s.nextInt();
int n4=s.nextInt();
int n5=s.nextInt();
int n6=s.nextInt();
for(int i=n3-1;i<n5;i++){
for(int j=n4-1;j<n6;j++){
a+=n[i][j];
}
}
System.out.print(a);
}
}