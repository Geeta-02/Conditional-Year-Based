//to check whether a given year is century year or not
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a%100==0){
     System.out.println("Century year");
    }
    else{
     System.out.println("Not a century year");
    }
}
}