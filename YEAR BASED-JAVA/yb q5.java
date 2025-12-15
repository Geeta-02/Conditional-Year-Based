 //  to check whether a given year and month combination is valid and print the number of days in that month.
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int m=sc.nextInt();
        boolean leap=(y%400==0 || y%4==0 && y%100!=0);
    
            if(m>=1 && m<=12)
            {
                if(m==1||m==3||m==5||m==7||m==8||m==12||m==10)
                {
                   System.out.print("31 days"); 
                }
                else if(m==4||m==6||m==9||m==11)
                {
                    System.out.print("30 days");
                }
                else{
                    if(leap)
                        System.out.print(" 29 days");
                    else
                        System.out.print("28 days");
                }
            }
        }
}