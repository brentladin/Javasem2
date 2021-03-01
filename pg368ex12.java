import java.util.*; 
public class pg368ex12{

    public static void main(String [] args){ 
    Scanner in = new Scanner (System.in);
    int num=0; 
    double sum= 0;
    int total= 0;  


    while (num>-1){ 
        System.out.println("Insert number:"); 
        num=in.nextInt(); 
        sum += num; 
total++; 

    }
    if (total>0){ 
        System.out.println("Your average was ="+ sum/total); 
    }
}
}