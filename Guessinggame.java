import java.util.*; 
public class Guessinggame {
    public static void main(String [] args){ 
        Random r = new Random(); 
       int winningnum= r.nextInt(100)+1; 
       int numguesses=0; 
       Scanner input= new Scanner(System.in);
       System.out.print("Guess an integer between 1-100: "); 
       int guess=input.nextInt(); 
       
      
while(guess!=winningnum){ 
System.out.print("Guess an integer between 1-100: "); 
guess= input.nextInt(); 
numguesses++; 

    if(guess==winningnum){
        System.out.println("Congrats! You are the winner. It took you"+numguesses+" guesses");
         
    }
    
    else if(guess<winningnum){ 
        System.out.println("You are too low"); 
    }
    else if(guess>winningnum){ 
        System.out.println("You are too high"); 
    
    }
}
}}