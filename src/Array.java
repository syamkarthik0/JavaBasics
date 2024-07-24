import java.util.Scanner;
import java.util.Arrays;
public class Array{
    public static void main(String aargs[]){
int a[]={1,2,3,4};
Scanner sc=new Scanner(System.in);
for(int i=0;i<a.length-1;i++){   
    System.out.println(a[i]);
}
System.out.println("enter the index value");
int len=sc.nextInt();
int b[]=new int[len];
for(int j=0;j<b.length;j++){
    System.out.println("enter value for index"+j);
    b[j]=sc.nextInt();
}
System.out.println("Index values:");
for(int k:b){
    System.out.println(k);
}
System.out.println(Arrays.toString(b));
}
}
gsgsgsg
bbdfbedb
ffmjiaenvdbnajkn