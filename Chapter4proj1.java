import java.util.*; 
public class Chapter4proj1 {
    public static int check1=0; 
    public static int check2=0; 
    public static void main (String [] args){ 
        Scanner console= new Scanner(System.in);//change the main so that you SOP "enter person A info"
        //then run through all of the program then calculates final score then it SOP print person B info and calculate 
        // final score at the end. Look at BMI sample for template 
      
        //student 1 information
        System.out.println("What is your name?");  
        String student1=console.nextLine(); 
        System.out.println(student1+" What is your GPA?"); 
        double GPA1=console.nextDouble(); 
        System.out.println("What is your ACT");  
        int ACT1=console.nextInt(); 
        System.out.println("What is your SAT?");  
        int SAT1=console.nextInt(); 
     //Student 2 information 
     System.out.println("What is your name?");  
     String student2=console.nextLine(); 
     console.next();
     System.out.println(student2+" What is your GPA?"); 
     double GPA2=console.nextDouble(); 
     System.out.println("What is your ACT");  
     int ACT2=console.nextInt(); 
     System.out.println("What is your SAT?");  
     int SAT2=console.nextInt(); 

     
        
     //three methods compare act compare sat compare gpa- see which students have the most 
        compareGPA(GPA1,GPA2); 
        compareSAT(SAT1,SAT2); 
        compareACT(ACT1,ACT2); 
if(check1>check2){ 
    System.out.println("Student 1 "+student1+" qualifies"); 
}
else if(check2>check1){ 
    System.out.println("Student 2 "+student2+" qualifies"); 
}
else{
    System.out.println("Sorry, neither one of you qualify"); 
}
        //a possible idea to condense/ simplify the code would be to just use one variable for each applicant so that I 
        //only have to call a method twice (similar to BMI method)/ 
        //ask for name of person 
}
public static void compareGPA(double GPA1,double GPA2){ 
    if(GPA1>GPA2){ 
        check1++; //adding one to check1 
    
    }
    else if(GPA2>GPA1){ 
        check2++; 
    }

    }
    public static void compareACT(int ACT1, int ACT2){ 
        if(ACT1>ACT2){ 
            check1++; //adding one to check1 
        
        }
        else if(ACT2>ACT1){ 
            check2++; 
        }
    
        }
    public static void compareSAT(int SAT1, int SAT2){ 
            if(SAT1>SAT2){ 
                check1++; //adding one to check1 
            
            }
            else if(SAT2>SAT1){ 
                check2++; 
            }
        
            } 
        
        
}
