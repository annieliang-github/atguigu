
class Circle {
    double radius;
    public double findArea() {
        return Math.PI * radius * radius;
    }
}    
    
public class Main{
    public static void main (String[] args) {
        Main test = new Main();
        Circle c = new Circle();
        test.printArea(c, 5);
        System.out.println("now radius is "+ c.radius);
    }    
        
    public void printArea(Circle c, int time) {
        System.out.println("Radius\t\t Area");
        for (int i = 0; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }   
        c.radius = time + 1;
    }       
}    
    
    


    

  



