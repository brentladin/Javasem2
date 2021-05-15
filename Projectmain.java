import java.util.*;
import java.io.*; 
public class ProjectV2 {
   
public static Scanner input= new Scanner(System.in); 
    public static void main(String [] args) throws FileNotFoundException{ 
        //double balane; 
        int selection=0; 
        double balance=0; 
        //projectObjectClass a = new projectObjectClass();
        projectObjectClass.newAcc(input); 
    System.out.print("--------------------------"); 
    System.out.println(); 
    System.out.print(" Welcome to Brent's Bank! "); //introduce the program to the users 
    System.out.println(); 
    System.out.print("--------------------------"); 

    //do u have an exisitng account or not
    //if so enter account number
    if(projectObjectClass.checkAcc()){
        //do rest of code
        System.out.println("true");
    }
    System.out.print(" Please select one of the following options "); 
    System.out.print("1) Open an account "); 
    System.out.print("2) Depostis" ); 
    System.out.print("3) Withdraws "); 
    System.out.print("4) Investments  "); 
    System.out.print("5) Close account  "); 
    System.out.print("6) Exit  "); 

    while(selection != 6){ //allows the user to select which part of the bank that they would like to access
if( selection == 1){ 
    projectObjectClass.checkAcc(); 
}
if( selection == 2 ){ 
    projectObjectClass.deposits(balance, input);
}
if( selection == 3 ){ 
   projectObjectClass.withdrawAmt(balance, input);  
 
}
if( selection == 4 ){ 
    projectObjectClass.Investments(balance, selection,input); 
}
if( selection == 5 ){ 
    projectObjectClass.exitBank(); 
}
while(selection < 1 || selection > 6){ 
    System.out.println("Please enter a valid selection: ");
	selection = input.nextInt();
}
    }
}

public static void deposits(double balance){ //deposits method 
System.out.println("Please enter the amount you would like to deposit");
double depositAmt= input.nextDouble(); 
balance+= depositAmt; //allows the user to deposit as much money into their account as they would like 
System.out.println("You know have $"+depositAmt+" in your account ");

}
 

public static void Investments(double balance, int selection){ 
   System.out.println(" Enter amount you would like to invest: "); 
    double investmentAmt= input.nextDouble(); 
    
if( investmentAmt<balance){  
   System.out.println("Would you like a rough estimate on how your investment will do?: 1)Yes 2)No thanks"); 
    int sel= input.nextInt(); //if the user wants to see how their investment might preform this function should show them so
    if( sel==1 ){ 
System.out.println("We can assume average rate of return of 8% yearly"); 
System.out.println("How many years would you like to invest");
int sel2= input.nextInt(); 
    
for( int i=1; i<sel2; i++){
 double investmentSum= balance*Math.pow((1+.09/1),sel2); //show them how much their $$$ will be worth if invested after a certain number of years 
  System.out.println("After year: "+i+" your total money will be worth"+investmentSum);

}
    }
}
  }

public static void exitBank(){ //exit program 
    System.out.println("Thank you for choosing Brent's bank, we hope to see you again");
}
}

