
    import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class weatherfiles {
    public static void main(String [] args) throws FileNotFoundException{ //everytime you use a file you need an exception
    File myFile= new File("/Users/brent/Library/Mobile Documents/com~apple~CloudDocs/Javasem2/example.txt");//copy absolute path 
    Scanner input = new Scanner(myFile);//easiest way to read a file is by using scanner
double temp1=0; 
    if(input.hasNextDouble()){
 temp1=input.nextDouble();
}
 
double temp2=0; 
double change=0; 

while(input.hasNext()){ 
    if(input.hasNextDouble()){ 
        temp2= input.nextDouble(); 
        change=temp2-temp1; 
        temp1=temp2; 
    System.out.printf("%.1f to %.1f, change= %.1f\n",temp1,temp2,change); 
    }
   else{ 
    String temp= input.next();
   }
}
} 
    }
