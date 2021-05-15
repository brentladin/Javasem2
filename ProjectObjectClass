import java.util.*;
import java.io.*;
public class projectObjectClass {
    public projectObjectClass (){

    }
    public static void newAcc(Scanner input) throws FileNotFoundException{
        System.out.println("enter new account number");
        int accNum = input.nextInt(); //define the accNum user input 
        File accs = new File("//Users//brent//Library//Mobile Documents//com~apple~CloudDocs//Javasem2//project.txt"); //create the account number file 
        Scanner u = new Scanner (accs); //define my scanner for the method 
        int lines = 0; // used to determine the amount of open account numbers 
        while(u.hasNextLine()){ //store amount of acc numbers
            if(u.nextLine().length()!=0){ //if their is text on the next line of the file, it will add 1 to the lines variable
                lines++;
            }
        }
        System.out.println(lines);
        u.close();
        u = new Scanner (accs);
        int users [] = new int [lines+1]; // array of users to tell the user how many other accounts are in the bank
        int uLine = 0; //starting with zero user 
        while(u.hasNextLine()){ //while their is an account number on the next line, add 1 to the user line count
            users[uLine] = u.nextInt(); //add the user number to the array 
            uLine++;
        }
        users[lines] = accNum; //storing the account numbers in the array 
        System.out.println(Arrays.toString(users)); //printing the string account numbers in the file 
        PrintStream newAccs = new PrintStream(accs); //editing the file 
        for(int i = 0; i<lines+1; i++){ //loop to reprints all of the users accounts into the file 
            newAccs.print(users[i]);
            System.out.print(users[i]);
            System.out.println(lines+" "+i);
            if(i < lines){
                newAccs.println();
            }
        }
    
    }
    public static boolean checkAcc() throws FileNotFoundException{
        Scanner r= new Scanner(System.in);
        //System.out.print("Please input your name"); 
        //String name= r.nextInt(); 
        System.out.print("Account number"); 
        int accNum= r.nextInt(); 
        File users= new File("//Users//brent//Library//Mobile Documents//com~apple~CloudDocs//Javasem2//project.txt"); 
        Scanner u = new Scanner(users);  
        while(u.hasNextLine()){ //while their is another line of input 
           int temp = u.nextInt();  //storing account number from the file so we can check
           if(temp == accNum){ //if the user input matches file account 
               System.out.println("account found");
               return true;
           }
           else{
               System.out.println("account not found");
               return false;
           }
       }
       return false;   
   }
   
    public static void withdrawAmt(double balance, Scanner input){ 
        System.out.println("Please enter the amount you would like to withdraw");
        double withdrawAmt=input.nextDouble(); //allows the user to withdraw money from their account 
        balance-=withdrawAmt; 
        System.out.println("After withdrawing $"+ withdrawAmt+" from your account, you know have a total balance of: $"+balance); 
    
    }
    public static void deposits(double balance, Scanner input){ 
        System.out.println("Please enter the amount you would like to deposit");
        double depositAmt= input.nextDouble(); 
        balance+= depositAmt; 
        System.out.println("You know have $"+depositAmt+" in your account ");
        
        }
        public static void Investments(double balance, int selection, Scanner input){
            System.out.println(" Enter amount you would like to invest: "); 
             double investmentAmt= input.nextDouble(); 
             
         if( investmentAmt<balance){  
            System.out.println("Would you like a rough estimate on how your investment will do?: 1)Yes 2)No thanks"); 
             int sel= input.nextInt(); 
             if( sel==1 ){ 
         System.out.println("We can assume average rate of return of 8% yearly"); 
         System.out.println("How many years would you like to invest");
         int sel2= input.nextInt(); 
             
         for( int i=1; i<sel2; i++){
          double investmentSum= balance*Math.pow((1+.09/1),sel2); //given that the average return for the S & P 500 is 8% this section of the progam allows the user to see how much that their money might be worth if invested for a certain period of time
           System.out.println("After year: "+i+" your total money will be worth"+investmentSum);
         
         }    
}
         }
         
         
        }
        public static void exitBank(){ 
            System.out.println("Thank you for choosing Brent's bank, we hope to see you again");
        }
    }
