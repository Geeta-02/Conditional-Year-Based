//to check whether a year is leap year or not
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a%400==0){
     System.out.println("Leap year");
    }
    else if(a%100==0){
     System.out.println("Leap year");
    }
    else if(a%4==0){
     System.out.println("Leap year");
    }
    else{
     System.out.println("Not a leap year");
    }
}
}