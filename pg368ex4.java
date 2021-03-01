import java.util.Random; 
public class pg368ex4 {
public static void main(String [] args){ 
    Random r= new Random(); 
   int num= 1l 
   

while(num<16); 

    for(int a=1; a< num; a++) { 
        num=r.nextInt(15)+5; 

        System.out.print("x"); 
    
    System.out.println("");
    
 
}
}
public static void makeguesses(){ 
    Random guesses= new Random(); 
    int guess= 1; //make a guess 
    int total = 0; //what loop you are on
while(guess<49){ 
    guess=guesses.nextInt(50)+1; //because the parameters are 1-50 
    System.out.println("Guess="+guess); 
    total++; //use this to track how many guesses you have 
} 
System.out.println("total guesses="+total); //total number of guesses
}









