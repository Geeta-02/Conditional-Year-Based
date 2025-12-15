//to check whether two given years have the same last digit
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    if(a%100 == b%100){
	     System.out.println("Same last digit");
	    }
	    else{
	       System.out.println("Not same digit");
	    }
	}
}