public class point {
   private int x; 
   private int y; 
   
//default constructors
public point(){ 
    x=0; 
    y=0; 
}
public point(int x1, int y1){ 
    x=x1; 
    y=y1; 
}
//Assessor methods- get the value 
public int getX(){ 
    return x; 
}
public int getY(){ 
    return y; 
}
//Mutators- manipulate the value
public void setX(int newX){ 
    x=newX; 
} 
public void setY(int newY){ 
    y=newY; 
}


public String toString(){ 
    return "( "+x+", "+y+" , "); 
}
}

