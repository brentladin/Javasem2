import java.io.*;
import java.util.*; 


public class employeehours {
    public static void main(String [] args) throws FileNotFoundException{ //everytime you use a file you need an exception
        File myFile= new File("/Users/brent/Library/Mobile Documents/com~apple~CloudDocs/Javasem2/example.txt");//copy absolute path 
        Scanner input = new Scanner(myFile);//easiest way to read a file is by using scanner
    int IDnum=0; 
    String name= ""; 
    double hours=0; 
    int days=0; 
    double avg=0; 
while(input.hasNextLine()){
    Scanner line= new Scanner(input.nextLine()); 
while(line.hasNext()){ 
    IDnum=line.nextInt(); 
    name=line.next(); 
while(line.hasNextDouble()){ 
    hours=hours+line.nextDouble(); 
    days++; 
}

}
avg= hours/days; 
System.out.print(IDnum+" "+  name);
System.out.printf("  %.1f and %.1f \n",hours,avg);
}

}

}
