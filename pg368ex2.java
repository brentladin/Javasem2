import java.util.*; 
public class pg368ex2{

    public static void main(String [] args){ 
       
        Scanner input= new Scanner(System.in);  
         System.out.print("Please enter first number to find GCD"); 
        int number1 = scanner.nextInt(); 
         System.out.print("Please enter second number to find GCD"); 
         int number2 = scanner.nextInt(); 
         System.out.print("GCD of two numbers " + number1 +" and " + number2 +" is :" + findGCD(number1,number2)); 

//find gcd is not the correct method redo main method
    }
    public static int findGCD(int number1, int number2){ 
     
        while(number2> 0) { 
            number1=number2; 
            int rem= number1%number2; 
            number2=rem; 
        } 
     

    
}

//double randomNum= Math.random(); - give you 0 - 1
// System.out.println(randomNum); 