
/*（1）声明一个圆柱体类型，
（2）声明属性：底边的半径，和高
（3）声明方法：
A：方法的功能：在方法中打印圆柱体的详细信息
	圆柱体的底边的半径是xxx，高是xxx，底面积是xxx，体积是xxx。
B：方法的功能：返回底面积 
C：方法的功能：返回体积
D：方法的功能：为圆柱体的底边的半径，和高赋值
E：方法的功能：为圆柱体的底边的半径，和高赋值，并返回赋值的结果
	如果底边的半径或高为<=0，赋值失败，返回false，否则返回true
（4）并测试	
*/

public class Main{
    
    public static void main(String[] args) {
        
        Cylinder c1 = new Cylinder();
        c1.setValue(5, 10);
        c1.getInfo();
        System.out.println(c1.getArea());
        
        Cylinder c2 = new Cylinder();
        System.out.println(c2.setBoth(-10, 0));
        c2.getInfo();
    }
    
}

class Cylinder {
    double radius;
    double height;
    
    public void getInfo() {
        System.out.println("底边半径是 " + radius + " 高是 " + height + 
        " 底面积是 " + getArea() + " 体积是 " + getVolumn());
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getVolumn() {
        return Math.PI * radius * radius * height;
    }
    
    public void setValue(double r, double h) {
        radius = r;
        height = h;
    }
    
    public boolean setBoth(double r, double h) {
        if (r > 0 && h > 0) {
            setValue(r, h);
            return true;
        } else {
            return false;
        }
    }
    
}




