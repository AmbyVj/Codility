import java.util.Scanner;
/*
 * 5. Write a program to read monetary amount in cents and print the smallest possible number of coins equaling the amount.
 *  Example: monetary amount in cents=288 2 Dollar 3 quarter 1 dime 3 pennies
 *  So smallest possible number of coins equaling the amount 283====9 coins

 */


public class CoinsCount_05 {

	public static void main(String[] args) {
		 System.out.println("Enter the Dollar amount in Cents : ");
		 Scanner scan = new Scanner(System.in);
	     double inpCents = scan.nextDouble(); 
	     
	     int dollars, quarters, dimes, nickels, cents;
	     
	     dollars = (int) inpCents/100;
	     inpCents =inpCents - (dollars*100);
	     quarters = (int) inpCents / 25;
	     inpCents =inpCents - (quarters*25);
	     dimes = (int)(inpCents / 10); 
	     inpCents =inpCents - (dimes*10);
	     nickels =(int) inpCents/5 ;
	     inpCents =inpCents - (nickels*5);
	     cents = (int)inpCents % 5 ;
	    
	     System.out.println("Coins: [Dollars: "+dollars+ "; Quaters: "+quarters+"; Dimes: "+dimes+"; Nickels: "+nickels+"; Cents:"+cents+"]");
	    
	     int numberOfCoins=dollars+quarters+dimes+nickels+cents;
	      
	     System.out.println("\nTotal number of coins : " +numberOfCoins);

	}

}
