
public class Line {
    Point p1; 
    Point p2; 
public Line(){ 
    p1= new Point(); 
    p2= new Point(); 
}
//constructor with parameters
 public Line(Point p1, Point p2){ 
        this.p1=p1; 
        this.p2=p2; 

    }
    public Point getP1(){ 
        return p1; 
    }
    public Point getP2(){ 
        return p2; 
    }

    public static double getSlope(Line ln){ 
//(y2-y1)/(x2-x1)
double x1= p1.getX(); 
double y1= p2.getX(); 
if(x1-x2 != 0){
   return (ln.getP1().getY()-ln.getP2().getY())/(double)(x1-x2)); 
  
}
else{ 
return 0.00001; 
}
    }
    public String toString(){ 
        // [(3,5),[3,-1]]
        return "[ "+ p1.toString()+" , "+p2.toString() + " ]"; 
    }

    public Line(int x1, int y1, int x2, int y2){
        p1.Point(x1, y1);
        p2.Point(x2, y2);
    }
    public boolean isCollinear(Point p){
        if(p.getX()!=pt1.getX()){
            if(Double.compare(getSlope(),Double.valueOf((p.getY()-p1.getY())/(p.getX()-p1.getX())))==0){
              //  System.out.println("hello");
                return true;
                
            }
            else{
                return false;
            }
        }
        else{
            if(p.getY() ==  p1.getY()){  
                return true;
            }
            else{
                return false;
            }
        }
}
