import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        System.out.println("enter the index value");

        Scanner sc =new Scanner(System.in);
int male=sc.nextLine().charAt(0);
int a[]=new int[male];
for(int j=0;j<a.length;j++){
    System.out.println("enter value for index"+j);
    a[j]=sc.nextInt(); 
}
System.out.println("Index values:");
for(int j:a){
    System.out.println(j);
    }
}
}