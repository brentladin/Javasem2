import java.util.*;
public class average {
    public static void main(String [] args){ 
        Scanner input= new Scanner(System.in);
        System.out.print(" Please enter one integer: ");
    int num1= input.nextInt();
            
     System.out.print(" Please enter another integer: "); 
        int num2= input.nextInt();   
    double avg= average(num1, num2); 
    System.out.println(avg); 


}
public static double average(int n1, int n2){ 
    return (n1+n2)/2.0; 
}
}
