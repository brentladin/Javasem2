import java.util.Random; 
public class pg368ex8 {
public static void main(String [] args){ 
    Random r= new Random(); 
    int move=0; 
    int pos=0; 
    int count=0; 
    int max=0; 

while(pos<3 && pos>-3){ 
    move=r.nextInt(2); 
    System.out.println(move);
if (move==0){ 
    move=-1; 
}
if (pos+move>move){ 
    max=pos+move; 
}
pos=pos+move; 
System.out.println("Position="+pos); 
count++;

System.out.println("The max position was = "+max); 
}

} 


}
