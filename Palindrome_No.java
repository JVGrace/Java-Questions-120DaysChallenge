import java.util.Scanner;
class palindrome{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a="",rev="";
a=sc.nextLine();
int l=a.length();
int i;
for(i=l-1;i>=0;i--){
rev=rev+a.charAt(i);
}
if(a.equals(rev)){
System.out.println("Palindrome");
}
else{
System.out.println("Not a Palindrome");
}
}
}