# integer
import java.io.*;
import java.util.*;
public class integer{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int k,m=0;
System.out.println("Enter the number");
m=sc.nextInt();
while(m>0){
m=m/10;
k++;
}
System.out.println("Number of Digit present : "+k);
}
}
