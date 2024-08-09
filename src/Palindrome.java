import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rev=0,r;
        while(num>0){
            r=num%10;
            rev=rev*10+r;
            num=num/10;    
        }
        if(temp==rev){
            System.out.println(temp+" is a Palindrome Number");
        }
        else{
            System.out.println(temp+" is not a Palindrome Number");
        }
    }
    
}
