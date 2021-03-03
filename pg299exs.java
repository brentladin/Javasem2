import java.util.*; 
public class pg299ex14 {
    public static void main(String [] args){ 
        Swappairs("hello there");
        Quadrant(0,0); 
}

public static String Swappairs(String param){ 
String letter1="";
String letter2=""
String comp="";
if(param.length()%2==0){ 
    for(int a=0; a<param.length()-1;a+=2){ 
        letter1=""+param.charAt(a+1);
        letter2=""+param.charAt(a);
        comp=comp+letter1+letter2; 
    } 
 if(param.length()%2!=0){ 
     comp=param.charAt(s.length()-1);


    }
}

}
public int static Quadrant(double x, double y){ 
if(x>0 && y>0){ 
    return 1; 
}
if(x<0 && y>0){ 
    return 2; 
} 
if(x<0 && y<0){ 
    return 3; 
}
if(x>0 && y<0){ 
    return 4; 

    return 0; //method needs to return 0 at the end 
}
}


}
}