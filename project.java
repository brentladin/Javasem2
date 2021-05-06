/* 
present the user with different options (open account, close account, deposit, withdraw, and invest)
use if statements to breakup user input 
make methods for each of the inputs 
then for the invest function- take them to another section where you present them with different options 
They can either invest in the S&P 500 (9%) or they can keep in in the bank 
Then run a simulation where you show them how much money they will have after year 1,2,3... if they invest in market vs bank account 
write a warning message and let them know that they might lose there money if they put it in the market 
Use files to store account numbers 
*/
import java.util.*;
 
public class Project {
    
    public static void main(String [] args){ 
        //double balane; 
        int selection=0; 
    Scanner input = new Scanner(System.in); 

    System.out.print("--------------------------"); 
    System.out.println(); 
    System.out.print(" Welcome to Brent's Bank! "); 
    System.out.println(); 
    System.out.print("--------------------------"); 

    System.out.print(" Please select one of the following options "); 
    System.out.print("1) Open an account "); 
    System.out.print("2) Deposits  "); 
    System.out.print(" 3)Withdraws "); 
    System.out.print("4) Investments  "); 
    System.out.print("5) Close account  "); 
    System.out.print("6) Exit  "); 

    while(selection != 6){ 
if( selection == 1){ 
    openAcc(); 
}
if( selection == 2 ){ 
    System.out.print(" Enter amount you would like to withdraw: ");
double withdrawAmt= input.nextDouble(); 
balance= balance-withdrawAmt; 
System.out.println

    withdraw(); 
}
if( selection == 3 ){ 
  
 System.out.print(" Enter amount you would like to deposit: ");
    double depositAmt= input.nextDouble(); 
    deposit(depositAmt); 
}
if( selection == 4 ){ 
    investment(); 
}
if( selection == 5 ){ 
    closeAcc(); 
}
while(selection < 1 || selection > 6){ 
    System.out.println("Please enter a valid selection: ");
	selection = input.nextInt();
}
}

    }
    // public static void withdraw(double withdrawAmt, double balance){ 
    // if(withdrawAmt >0){ 
    //     System.out.print("Please enter withdraw amount: "); 
    //     withdrawAmt=input.nextDouble();
    //     balance= balance-withdrawAmt; 
    // }
    // }
}
