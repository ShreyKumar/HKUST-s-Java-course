import comp102x.IO;

public class Lab02
{
    
    public static void multiply()
    {
        int x = 0;
        int y = 0;
        
        IO.output("Enter an integer, x: ");
        x = IO.inputInteger();
        IO.output("Enter an integer, y: ");
        y = IO.inputInteger();
        
        int z = x * y;
        
        IO.outputln("Answer = " + z);
        
        
        
        
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
        double height;
        double width;
        
        IO.output("Enter the width of the triange: ");
        width = IO.inputDouble();
        
        IO.output("Enter the height of the triangle: ");
        height = IO.inputDouble();
        
        double area = (width * height)/2;
        
        IO.outputln("The triangle area = " + area);
        
        
        
        
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        double a;
        double b;
        double c;
        
        IO.output("Enter a: ");
        a = IO.inputDouble();
        
        IO.output("Enter b: ");
        b = IO.inputDouble();
        
        IO.output("Enter c: ");
        c = IO.inputDouble();
        
        
        double x1 = (-b + Math.sqrt(Math.pow(b, 2.0) - 4 * (a * c)))/(2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2.0) - 4 * (a * c)))/(2 * a);
        
        IO.outputln("First solution for x = " + x1);
        IO.outputln("Second solution for x = " + x2);
        
        
        
        
    }
}
