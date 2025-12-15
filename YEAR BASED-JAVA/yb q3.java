//to check whether the first two digits and last two digits of a year are equal
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int y=sc.nextInt();
    int f=y/100;
    int l=y%100;
    if(f==l){
     System.out.println("Equal");
    }
    else{
     System.out.println("Not equal");
    }
}
}