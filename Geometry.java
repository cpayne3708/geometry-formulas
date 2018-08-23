/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double length, double width) 
    {
        return length * width;
    }
    
    /**
     * Calculates the area of a triange.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static void main(String[] args) 
       {
        System.out.println(distance(0,0,3,4));
    }
    
    
    
    //my code
    
    public static double trapezoidArea(double b, double top, double h) 
    {
        return ((b + top)/2) * h;
    } 
    
    public static double rectPrismVolume(double l,double w,double h) 
    {
        return l * w * h;
    } 
    
    public static double coneVolume(double r, double h) 
    {
        return (Math.PI * Math.pow(r,2)) * h / 3;
    } 
    
    public static double rectPrismSurface(double l,double w, double h) 
    {
        return 2 * (l*w) + 2 * (l * h) + 2 * (w * h);
    } 
    
    public static double sphereSurface(double r) 
    {
        return 4 * Math.PI * Math.pow(r,2);
    } 
    
    public static double hypotenuse(double leg1,double leg2) 
    {
        return Math.sqrt(Math.pow(leg1,2) + Math.pow(leg2,2));
    }
    
    public static double distance(double x1,double y1, double x2, double y2) 
    {
        return hypotenuse(x2-x1,y2-y1);
    } 
    
    public static double slope(double x1,double y1, double x2, double y2) {
        return (y2-y1) / (x2-x1);
    }
}
