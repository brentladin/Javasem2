public class forloop {
    public static final int SIZE=10; //final means is a constant 
        public static void main(String args[])    
        {
            for(int line = 1; line <=SIZE; line++){
                frontdots(line); 
                System.out.print(line);
                backdots(line); 
                System.out.println();
            }
        }
        
           
       
        
    
   
   public static void frontdots (int line){

   for(int dot = 1; dot<= -line+5; dot++){
    System.out.print(".");
   }
    }
public static void backdots(int line){
    for(int dot=1; dot <= line-1; dot++){
        System.out.print(".");
    }

}
}